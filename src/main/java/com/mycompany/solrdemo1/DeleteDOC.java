/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.solrdemo1;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;

/**
 *
 * @author ruturaj
 */
public class DeleteDOC {
    public static void main(String[] args) throws Exception{
        SolrClient Solr = new HttpSolrClient.Builder("http://localhost:8983/solr/audiovideo").build();
       
      //Deleting the documents from Solr 
      Solr.deleteByQuery("*");        
         
      //Saving the document 
      //Solr.commit(); 
      System.out.println("Documents deleted"); 
      Solr.commit();
    }
}
