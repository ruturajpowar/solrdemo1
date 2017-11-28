/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.solrdemo1;

import java.io.File;
import java.util.Scanner;
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
        getDataFromSolr();

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
                if(csvArr[0].indexOf("X")==-1){               
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
    
    public static void getDataFromSolr()throws Exception{
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book Name : ");
        String bookName=sc.nextLine();
        SolrClient client = new HttpSolrClient.Builder("http://localhost:8983/solr/books").build();

        SolrQuery query = new SolrQuery();
        query.setQuery("name:"+bookName);
        query.setFields("name","price","instock","series","genere");
        query.setStart(0);
        System.out.println("query "+query);
        QueryResponse response = client.query(query);
        SolrDocumentList results = response.getResults();
        System.out.println("size "+results.size());
        for (int i = 0; i < results.size(); ++i) {
            System.out.println(results.get(i));
        }       
    sc.close();   
    }
}
