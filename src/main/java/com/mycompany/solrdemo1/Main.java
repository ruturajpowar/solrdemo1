/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.solrdemo1;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;

/**
 *
 * @author ruturaj
 */
public class Main {

    public static void main(String[] args) throws Exception {
        List<AudioVideoPojo> audioVideoList = new ArrayList<>();
        System.out.println("-------- MySQL JDBC Connection Testing ------------");

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }

        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://10.208.27.155:3306/audiovideo", "root", "hcdc@2015");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
            String sql = ("SELECT * FROM mit_dc_metadata_information;");
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                AudioVideoPojo audioVideoPojo = new AudioVideoPojo();
                int id = rs.getInt("metadata_id");
                String f1 = rs.getString("coverage");
                audioVideoPojo.setId(rs.getLong("metadata_id"));
                audioVideoPojo.setAccrualMethod(rs.getString("accrual_method"));
                audioVideoPojo.setAccrualPeriodicity(rs.getString("accrual_periodicity"));
                audioVideoPojo.setAllowedLanguages(rs.getString("allowedLanguages"));
                audioVideoPojo.setAssignedTo(rs.getLong("assigned_to"));
                audioVideoPojo.setCreatedOn(rs.getDate("createdOn"));
                audioVideoPojo.setAudience(rs.getString("audience"));
                audioVideoPojo.setContributor(rs.getString("contributor"));
                audioVideoPojo.setCoverage(rs.getString("coverage"));
                audioVideoPojo.setCreator(rs.getString("creator"));
                audioVideoPojo.setCrowdSourceFlag(rs.getBoolean("crowd_source_flag"));
                audioVideoPojo.setCrowdSourceStageFlag(rs.getBoolean("crowd_source_stage_flag"));
                audioVideoPojo.setCurationStatus(rs.getString("curation_status"));
                audioVideoPojo.setCustomNotation(rs.getString("custom_notation"));
                audioVideoPojo.setDate(rs.getString("dc_date"));
                audioVideoPojo.setDescription(rs.getString("description"));
                audioVideoPojo.setEdition(rs.getString("edition"));
                audioVideoPojo.setF1(rs.getString("f1"));
                audioVideoPojo.setF2(rs.getString("f2"));
                audioVideoPojo.setF3(rs.getString("f3"));
                audioVideoPojo.setF4(rs.getString("f4"));
                audioVideoPojo.setF5(rs.getString("f5"));
                audioVideoPojo.setF6(rs.getString("f6"));
                audioVideoPojo.setF7(rs.getString("f7"));
                audioVideoPojo.setF8(rs.getString("f8"));
                audioVideoPojo.setF9(rs.getString("f9"));
                audioVideoPojo.setF10(rs.getString("f10"));
                audioVideoPojo.setFinalScore(rs.getFloat("final_score"));
                audioVideoPojo.setFormat(rs.getString("format"));
                audioVideoPojo.setIdentifier(rs.getString("identifier"));
                audioVideoPojo.setIndexedFlag(rs.getBoolean("has_indexed"));
                audioVideoPojo.setIsbn(rs.getString("isbn"));
                audioVideoPojo.setIssn(rs.getString("issn"));
                audioVideoPojo.setJsonView(rs.getString("jsonData"));
                audioVideoPojo.setLanguages(rs.getString("languages"));
                audioVideoPojo.setLinkedWithArticleCount(rs.getLong("linked_with_article_count"));
                audioVideoPojo.setLocation(rs.getString("location"));
                audioVideoPojo.setMarkTaggingJson(rs.getString("markTaggingJson"));
                audioVideoPojo.setMetadataStandard(rs.getString("metaDataStandard"));
                audioVideoPojo.setNotes(rs.getString("notes"));
                audioVideoPojo.setOriginalFileName(rs.getString("fileName"));
                audioVideoPojo.setOtherTagJson(rs.getString("other_tag_json"));
                audioVideoPojo.setOtherTagValues(rs.getString("other_tag_values"));
                audioVideoPojo.setPeriodStart(rs.getLong("periodStart"));
                audioVideoPojo.setPrefix(rs.getString("element_prefix"));
                audioVideoPojo.setProvenance(rs.getString("provenance"));
                audioVideoPojo.setPublisher(rs.getString("publisher"));
                audioVideoPojo.setRatingCount(rs.getLong("rating_count"));
                audioVideoPojo.setRatingScore(rs.getFloat("rating_score"));
                audioVideoPojo.setRecordIdentifier(rs.getString("record_identifier"));
                audioVideoPojo.setRecordLikeCount(rs.getLong("record_like_count"));
                audioVideoPojo.setRecordNoOfDownloads(rs.getLong("record_no_of_downloads"));
                audioVideoPojo.setRecordNoOfReview(rs.getLong("record_no_of_review"));
                audioVideoPojo.setRecordNoOfShares(rs.getLong("record_no_of_shares"));
                audioVideoPojo.setRecordViewCount(rs.getLong("record_view_count"));
                audioVideoPojo.setRelation(rs.getString("relation"));
                audioVideoPojo.setRights(rs.getString("rights"));
                audioVideoPojo.setRootElement(rs.getString("root_element"));
                audioVideoPojo.setSource(rs.getString("source"));
                audioVideoPojo.setSubResourceIdentifier(rs.getString("subresourceIdentifier"));
                audioVideoPojo.setSubject(rs.getString("subject"));
                audioVideoPojo.setTitle(rs.getString("title"));
                audioVideoPojo.setType(rs.getString("type"));
                audioVideoPojo.setUdcNotation(rs.getString("udc_notation"));
                audioVideoPojo.setUpdatedOn(rs.getDate("updatedOn"));
                audioVideoPojo.setLocalObjectAvailable(rs.getBoolean("localObjectAvailable"));
                audioVideoList.add(audioVideoPojo);

            }
            System.out.println("### :" + audioVideoList.size());
            dumpDataSolrFromDatabase(audioVideoList);
        } else {
            System.out.println("Failed to make connection!");
        }

    }

    public static void dumpDataSolrFromDatabase(List<AudioVideoPojo> audioVideoList) throws Exception {
        SolrClient client = new HttpSolrClient.Builder("http://localhost:8983/solr/audiovideo").build();
//       client.setParser(new XMLResponseParser());
        client.addBeans(audioVideoList);
        client.commit();

    }

    public static void dumpDataSolr() throws Exception {
        File file = new File("/home/ruturaj/solr-7.1.0/example/exampledocs/books.csv");
        if (file.isDirectory()) {
            System.out.println("directory");
        } else if (file.isFile()) {
            Scanner sc = new Scanner(file);
            sc.nextLine();
            SolrClient client = new HttpSolrClient.Builder("http://localhost:8983/solr/books").build();
            while (sc.hasNext()) {
                String[] csvArr = sc.nextLine().split(",");
                if (csvArr[0].indexOf("X") == -1) {
                    SolrInputDocument doc = new SolrInputDocument();
                    doc.addField("id", csvArr[0]);
                    doc.addField("cat", csvArr[1]);
                    doc.addField("name", csvArr[2]);
                    doc.addField("price", csvArr[3]);
                    doc.addField("instock", csvArr[4]);
                    doc.addField("author", csvArr[5]);
                    doc.addField("series", csvArr[6]);
                    doc.addField("genre", csvArr[8]);
                    client.add(doc);
                }
            }
            client.commit();
            sc.close();

        } else {
            System.out.println("something else");
        }
    }

    public static void getDataFromSolr() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Name : ");
        String bookName = sc.nextLine();
        SolrClient client = new HttpSolrClient.Builder("http://localhost:8983/solr/books").build();
        SolrQuery query = new SolrQuery();
        query.setQuery("name:" + bookName);
        query.setFields("name", "price", "instock", "series", "genere");
        query.setStart(0);
        System.out.println("query " + query);
        QueryResponse response = client.query(query);
        SolrDocumentList results = response.getResults();
        System.out.println("size " + results.size());
        for (int i = 0; i < results.size(); ++i) {
            System.out.println(results.get(i));
        }
        sc.close();
    }
}
