package com.javabackend.javabacked.util;
/*
 * 
 * 
 * import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;
 * 
 * import java.io.IOException; import java.math.BigDecimal; import
 * java.util.ArrayList; import java.util.HashMap; import java.util.List; import
 * java.util.Map;
 * 
 * import org.elasticsearch.action.index.IndexRequest; import
 * org.elasticsearch.action.search.SearchRequest; import
 * org.elasticsearch.action.search.SearchResponse; import
 * org.elasticsearch.action.search.SearchType; import
 * org.elasticsearch.action.update.UpdateRequest; import
 * org.elasticsearch.action.update.UpdateResponse; import
 * org.elasticsearch.client.RequestOptions; import
 * org.elasticsearch.client.RestHighLevelClient; import
 * org.elasticsearch.client.transport.TransportClient; import
 * org.elasticsearch.common.lucene.search.Queries; import
 * org.elasticsearch.index.query.BoolQueryBuilder; import
 * org.elasticsearch.index.query.IdsQueryBuilder; import
 * org.elasticsearch.index.query.MatchQueryBuilder; import
 * org.elasticsearch.index.query.MultiMatchQueryBuilder; import
 * org.elasticsearch.index.query.QueryBuilders; import
 * org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder; import
 * org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders; import
 * org.elasticsearch.search.SearchHit; import
 * org.elasticsearch.search.aggregations.Aggregation; import
 * org.elasticsearch.search.aggregations.AggregationBuilders; import
 * org.elasticsearch.search.aggregations.bucket.terms.Terms; import
 * org.elasticsearch.search.builder.SearchSourceBuilder; import
 * org.springframework.boot.actuate.autoconfigure.web.ManagementContextType;
 * import org.springframework.stereotype.Component;
 * 
 * import com.javabackend.javabacked.model.ProductOB;
 * 
 * @Component public class ProductHelper {
 * 
 * public List<ProductOB> getListFromElacstic(SearchResponse response) {
 * List<ProductOB> listPro = new ArrayList<ProductOB>();
 * System.out.println("============DANH SÁCH============");
 * System.out.printf("%-20s %-20s %-20s %-20s %s \n\n", "Score", "Id", "Name",
 * "Categoryid", "Price");
 * 
 * response.getHits().forEach(hit -> { displayResult(hit); Map<String, Object>
 * sourceMap = hit.getSourceAsMap(); listPro.add(new
 * ProductOB(Integer.parseInt(hit.getId()), (String) sourceMap.get("name"),
 * Integer.parseInt(String.valueOf(sourceMap.get("categoryid"))),
 * Double.parseDouble(String.valueOf(sourceMap.get("price")))));
 * 
 * }); return listPro; } public void addDocToElastic(RestHighLevelClient client,
 * ProductOB productOB, String index) { IndexRequest request = new
 * IndexRequest("java_fresher_product").id(productOB.getId() +
 * "").source("name", productOB.getName(), "price", productOB.getPrice(),
 * "categoryid", productOB.getCategoryid()); try { client.index(request,
 * RequestOptions.DEFAULT); System.out.
 * println("==================================\nInsert vào ELasticsearch thành công"
 * );
 * 
 * } catch (IOException e) { e.printStackTrace(); } } private void
 * bucketsDisplay(SearchResponse response, String termName) {
 * System.out.println("\n=======THỐNG KÊ==========\nBucket");
 * Map<String,Aggregation> agreMap = response.getAggregations().getAsMap();
 * Terms terms = (Terms) agreMap.get(termName); terms.getBuckets().forEach(x->{
 * System.out.println("key: " + x.getKeyAsString() + ", count: " +
 * x.getDocCount()); }); }
 * 
 * private void displayResult(SearchHit hit) { Map<String, Object> sourceMap =
 * hit.getSourceAsMap(); BigDecimal bigDecimal = new
 * BigDecimal(Double.parseDouble(String.valueOf(sourceMap.get("price"))));
 * System.out.printf("%-20f %-20s %-20s %-20d %s \n", hit.getScore(),
 * hit.getId(), sourceMap.get("name"), sourceMap.get("categoryid"), bigDecimal +
 * " đ"); }
 * 
 * public SearchResponse searchProByCategoryId(RestHighLevelClient client,
 * String categoryid) { BoolQueryBuilder query = QueryBuilders.boolQuery()
 * .should(QueryBuilders.termQuery("categoryid", categoryid));
 * SearchSourceBuilder sb = new SearchSourceBuilder();
 * 
 * sb.query(query); sb.size(100); SearchRequest request = new SearchRequest();
 * request.indices("index_backend_fresher"); request.source(sb); SearchResponse
 * response =null; try { response =
 * client.search(request,RequestOptions.DEFAULT); client.close(); } catch
 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
 * return response; } public SearchResponse searchProById(RestHighLevelClient
 * client, int id) { IdsQueryBuilder query = QueryBuilders.idsQuery();
 * query.addIds(id+""); SearchSourceBuilder sb = new SearchSourceBuilder();
 * 
 * sb.query(query); sb.size(100); SearchRequest request = new SearchRequest();
 * request.indices("java_fresher_product"); request.source(sb); SearchResponse
 * response =null; try { response =
 * client.search(request,RequestOptions.DEFAULT); // client.close(); } catch
 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
 * return response; } public SearchResponse searchAll(RestHighLevelClient
 * client,String indices) { BoolQueryBuilder query=
 * QueryBuilders.boolQuery().must(QueryBuilders.matchAllQuery());
 * SearchSourceBuilder sb = new SearchSourceBuilder();
 * 
 * sb.query(query); sb.size(100); SearchRequest request = new SearchRequest();
 * request.indices(indices); request.source(sb); SearchResponse response =null;
 * try { response = client.search(request,RequestOptions.DEFAULT);
 * client.close(); } catch (IOException e) { e.printStackTrace(); } return
 * response; } public UpdateResponse updatefield(RestHighLevelClient
 * client,ProductOB newPro, String indices) {
 * 
 * UpdateRequest updateRequest = new UpdateRequest(indices,newPro.getId()+"");
 * 
 * 
 * UpdateResponse response =null; try { Map<String, ProductOB> map = new
 * HashMap<>(); updateRequest.doc(jsonBuilder() .startObject() .field("name",
 * newPro.getName()) .field("price",newPro.getPrice())
 * .field("categoryid",newPro.getCategoryid()) .endObject()); response =
 * client.update(updateRequest,RequestOptions.DEFAULT);
 * 
 * } catch (IOException e) { e.printStackTrace(); } return response; } public
 * SearchResponse aggregation(RestHighLevelClient client,String keyWord, int
 * size,String indices,String termName) { FunctionScoreQueryBuilder queryScore =
 * new FunctionScoreQueryBuilder(QueryBuilders.multiMatchQuery(keyWord,
 * "name"),ScoreFunctionBuilders.scriptFunction("doc['price'].value"));
 * SearchSourceBuilder sb = new SearchSourceBuilder(); sb.query(queryScore);
 * sb.aggregation(AggregationBuilders.terms(termName).field("categoryid"));
 * sb.size(size); SearchRequest request = new SearchRequest();
 * request.indices(indices); request.source(sb); SearchResponse response = null;
 * try { response = client.search(request, RequestOptions.DEFAULT);
 * bucketsDisplay(response, termName); client.close(); } catch (IOException e) {
 * // TODO Auto-generated catch block e.printStackTrace(); } return response;
 * 
 * 
 * } }
 */