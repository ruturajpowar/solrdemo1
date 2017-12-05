package com.mycompany.solrdemo1;

import java.util.Date;
import org.apache.solr.client.solrj.beans.Field;

/**
 * Entity for dc_metadata_information. Entity in which records are stored. And
 * as it store records, all searching happen on it. For searching purpose, we
 * build lucene index.
 *
 * @author Madhuri
 * @since 1
 * @version 1
 */
@SuppressWarnings("serial")
public class AudioVideoPojo {
       
    @Field("metadata_id")
    private Long id;
     /**
     * accural method
     */
    @Field("accrual_method")
    private String accrualMethod;
    /**
     * accrual_periodicity
     */
    @Field("accrual_periodicity")
    private String accrualPeriodicity;
    /**
     * allowedLanguages
     */
    @Field("allowedLanguages")
    private String allowedLanguages;
    
    /**
     * it will hold user id from nvli which says to whom this record is
     * assigned. 0 means it is not assigned yet
     */
    @Field("assigned_to")
    private Long assignedTo;
    /**
     * audience
     */
    @Field("audience")
    private String audience;
    /**
     * contributor
     */
    @Field("contributor")
    private String contributor;
    /**
     * coverage
     */
    @Field("coverage")
    private String coverage;
     /**
     * created on
     */
    @Field("createdOn")
    private Date createdOn;
    /**
     * creator
     */
    @Field("creator")
    private String creator;
    /**
     * crowd Source Flag
     */
    @Field("crowd_source_flag")
    private boolean crowdSourceFlag;
    
    /**
     * crowd Source Stage Flag
     */
    @Field("crowd_source_stage_flag")
    private boolean crowdSourceStageFlag;
    /**
     * Curation status @{link CurationStatus}
     */
    @Field("curation_status")
    private String curationStatus;
    /**
     * custom notation
     */
    @Field("custom_notation")
    private String customNotation;
    /**
     * dc date
     */
    @Field("dc_date")
    private String date;
    /**
     * description
     */
    @Field("description")
    private String description;
    /**
     * edition
     */
    @Field("edition")
    private String edition;
    /**
     * final score
     */
    @Field("final_score")
    private float finalScore;
     
    /**
     * format
     */
    @Field("format")
    private String format;
     /**
     * identifier
     */
    @Field("identifier")
    private String identifier;
    
    /**
     * indexedFlag
     */
    @Field("has_indexed")
    private boolean indexedFlag;
     /**
     * isbn
     */
    @Field("isbn")
    private String isbn;
    /**
     * issn
     */
    @Field("issn")
    private String issn;
    /**
     * json view
     */
    @Field("jsonData")
    private String jsonView;
    /**
     * languages
     */
    @Field("languages")
    private String languages;
   /**
     * lccn
     */
    @Field("lccn")
    private String lccn;
    /**
     * linked With Article Count
     */
    @Field("linked_with_article_count")
    private long linkedWithArticleCount;
    /**
     * location
     */
    @Field("location")
    private String location;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * record identifier to uniquely identify record.
     */
    @Field("record_identifier")
    private String recordIdentifier;
    /**
     * original file name.
     */
    @Field("fileName")
    private String originalFileName;
    /**
     * title
     */
    @Field("title")
    private String title;
    
    /**
     * rights
     */
    @Field("rights")
    private String rights;
   
    /**
     * relation
     */
    @Field("relation")
    private String relation;
    
   
    /**
     * subject
     */
    @Field("subject")
    private String subject;
    
    /**
     * publisher
     */
    @Field("publisher")
    private String publisher;
    /**
     * source
     */
    @Field("source")
    private String source;
    
    
    /**
     * provenance
     */
    @Field("provenance")
    private String provenance;
    /**
     * type
     */
    @Field("type")
    private String type;
    
   
    
   
    
    /**
     * notes
     */
    @Field("notes")
    private String notes;
    
    /**
     * updated on
     */
    @Field("updatedOn")
    private Date updatedOn;
   
    
    /**
     * record Like Count
     */
    @Field("record_like_count")
    private long recordLikeCount;
    /**
     * record view count
     */
    @Field("record_view_count")
    private long recordViewCount;
    /**
     * record No Of Downloads
     */
    @Field("record_no_of_downloads")
    private long recordNoOfDownloads;
    
    /**
     * rating count
     */
    @Field("rating_count")
    private long ratingCount = 0;
    /**
     * record no of shares
     */
    @Field("record_no_of_shares")
    private long recordNoOfShares = 0;
    
    /**
     * rating score
     */
    @Field("rating_score")
    private float ratingScore;
    
    /**
     * udc notation
     */
    @Field("udc_notation")
    private String udcNotation;
    
    /**
     * root element
     */
    @Field("root_element")
    private String rootElement;
    /**
     * prefix
     */
    @Field("element_prefix")
    private String prefix;
    /**
     * namespace
     */
    @Field("element_namespace")
    private String namespace;
    /**
     * subResourceIdentifier
     */
    @Field("subResourceIdentifier")
    private String subResourceIdentifier;
    /**
     * Generic field f1 used for faceting
     */
    @Field("f1")
    private String f1;
    /**
     * Generic field f2 used for faceting
     */
    @Field("f2")
    private String f2;
    /**
     * Generic field f3 used for faceting
     */
    @Field("f3")
    private String f3;
    /**
     * Generic field f4 used for faceting
     */
    @Field("f4")
    private String f4;
    /**
     * Generic field f5 used for faceting
     */
    @Field("f5")
    private String f5;
    /**
     * Generic field f6 used for faceting
     */
    @Field("f6")
    private String f6;
    /**
     * Generic field f7 used for faceting
     */
    @Field("f7")
    private String f7;
    /**
     * Generic field f8 used for faceting
     */
    @Field("f8")
    private String f8;
    /**
     * Generic field f9 used for faceting
     */
    @Field("f9")
    private String f9;
    /**
     * Generic field f10 used for faceting
     */
    @Field("f10")
    private String f10;
    /**
     * record no of review
     */
    @Field("record_no_of_review")
    private long recordNoOfReview = 0;
    /**
     * periodStart
     */
    
    @Field("periodStart")
    private Long periodStart;
    
    
    
    @Field("metadataStandard")
    private String metadataStandard;
    /**
     * local object like video and MP3
     */
    @Field("localObjectAvailable")
    private boolean localObjectAvailable;

    
    
    
    
    public AudioVideoPojo() {
    }
    
    public String getMetadataStandard() {
        return metadataStandard;
    }

    public void setMetadataStandard(String metadataStandard) {
        this.metadataStandard = metadataStandard;
    }
    /**
     * 
     * @return localObjectAvailable
     */
    public boolean isLocalObjectAvailable() {
        return localObjectAvailable;
    }
    /**
     * 
     * @param localObjectAvailable 
     */
    public void setLocalObjectAvailable(boolean localObjectAvailable) {
        this.localObjectAvailable = localObjectAvailable;
    }
    
    /**
     * give value of allowedLanguages property
     *
     * @return
     */
    public String getAllowedLanguages() {
        return allowedLanguages;
    }

    /**
     * set value of allowedLanguages property
     *
     * @param allowedLanguages
     */
    public void setAllowedLanguages(String allowedLanguages) {
        this.allowedLanguages = allowedLanguages;
    }

    /**
     * give value of assignedTo property
     *
     * @return
     */
    public Long getAssignedTo() {
        return assignedTo;
    }

    /**
     * set value of assignedTo property
     *
     * @param assignedTo
     */
    public void setAssignedTo(Long assignedTo) {
        this.assignedTo = assignedTo;
    }

    /**
     * give value of curationStatus property
     *
     * @return
     */
    public String getCurationStatus() {
        return curationStatus;
    }

    /**
     * set value of curationStatus property
     *
     * @param curationStatus
     */
    public void setCurationStatus(String curationStatus) {
        this.curationStatus = curationStatus;
    }

    /**
     * give value of periodStart property
     *
     * @return
     */
    public Long getPeriodStart() {
        return periodStart;
    }

    /**
     * set value of periodStart property
     *
     * @param periodStart
     */
    public void setPeriodStart(Long periodStart) {
        this.periodStart = periodStart;
    }

    /**
     * give value of finalScore property
     *
     * @return
     */
    public float getFinalScore() {
        return finalScore;
    }

    /**
     * set value of finalScore property
     *
     * @param finalScore
     */
    public void setFinalScore(float finalScore) {
        this.finalScore = finalScore;
    }

    /**
     * give value of linkedWithArticleCount property
     *
     * @return
     */
    public long getLinkedWithArticleCount() {
        return linkedWithArticleCount;
    }

    /**
     * set value of linkedWithArticleCount property
     *
     * @param linkedWithArticleCount
     */
    public void setLinkedWithArticleCount(long linkedWithArticleCount) {
        this.linkedWithArticleCount = linkedWithArticleCount;
    }

    /**
     * give value of ratingScore property
     *
     * @return
     */
    public float getRatingScore() {
        return ratingScore;
    }

    /**
     * set value of ratingScore property
     *
     * @param ratingScore
     */
    public void setRatingScore(float ratingScore) {
        this.ratingScore = ratingScore;
    }

    /**
     * give value of recordNoOfReview property
     *
     * @return
     */
    public long getRecordNoOfReview() {
        return recordNoOfReview;
    }

    /**
     * set value of recordNoOfReview property
     *
     * @param recordNoOfReview
     */
    public void setRecordNoOfReview(long recordNoOfReview) {
        this.recordNoOfReview = recordNoOfReview;
    }

    /**
     * give value of f1 property
     *
     * @return
     */
    public String getF1() {
        return f1;
    }

    /**
     * set value of f1 property
     *
     * @param f1
     */
    public void setF1(String f1) {
        this.f1 = f1;
    }

    /**
     * give value of f2 property
     *
     * @return
     */
    public String getF2() {
        return f2;
    }

    /**
     * set value of f2 property
     *
     * @param f2
     */
    public void setF2(String f2) {
        this.f2 = f2;
    }

    /**
     * give value of f3 property
     *
     * @return
     */
    public String getF3() {
        return f3;
    }

    /**
     * set value of f3 property
     *
     * @param f3
     */
    public void setF3(String f3) {
        this.f3 = f3;
    }

    /**
     * give value of f4 property
     *
     * @return
     */
    public String getF4() {
        return f4;
    }

    /**
     * set value of f4 property
     *
     * @param f4
     */
    public void setF4(String f4) {
        this.f4 = f4;
    }

    /**
     * give value of f5 property
     *
     * @return
     */
    public String getF5() {
        return f5;
    }

    /**
     * set value of f5 property
     *
     * @param f5
     */
    public void setF5(String f5) {
        this.f5 = f5;
    }

    /**
     * give value of f10 property
     *
     * @return
     */
    public String getF10() {
        return f10;
    }

    /**
     * set value of f10 property
     *
     * @param f10
     */
    public void setF10(String f10) {
        this.f10 = f10;
    }

    /**
     * give value of f6 property
     *
     * @return
     */
    public String getF6() {
        return f6;
    }

    /**
     * set value of f6 property
     *
     * @param f6
     */
    public void setF6(String f6) {
        this.f6 = f6;
    }

    /**
     * give value of f7 property
     *
     * @return
     */
    public String getF7() {
        return f7;
    }

    /**
     * set value of f7 property
     *
     * @param f7
     */
    public void setF7(String f7) {
        this.f7 = f7;
    }

    /**
     * give value of f8 property
     *
     * @return
     */
    public String getF8() {
        return f8;
    }

    /**
     * set value of f8 property
     *
     * @param f8
     */
    public void setF8(String f8) {
        this.f8 = f8;
    }

    /**
     * give value of f9 property
     *
     * @return
     */
    public String getF9() {
        return f9;
    }

    /**
     * set value of f9 property
     *
     * @param f9
     */
    public void setF9(String f9) {
        this.f9 = f9;
    }

    /**
     * give value of subResourceIdentifier property
     *
     * @return
     */
    public String getSubResourceIdentifier() {
        return subResourceIdentifier;
    }

    /**
     * set value of subResourceIdentifier property
     *
     * @param subResourceIdentifier
     */
    public void setSubResourceIdentifier(String subResourceIdentifier) {
        this.subResourceIdentifier = subResourceIdentifier;
    }

    /**
     * give value of ratingCount property
     *
     * @return
     */
    public long getRatingCount() {
        return ratingCount;
    }

    /**
     * set value of ratingCount property
     *
     * @param ratingCount
     */
    public void setRatingCount(long ratingCount) {
        this.ratingCount = ratingCount;
    }

    /**
     * give value of recordNoOfShares property
     *
     * @return
     */
    public long getRecordNoOfShares() {
        return recordNoOfShares;
    }

    /**
     * set value of recordNoOfShares property
     *
     * @param recordNoOfShares
     */
    public void setRecordNoOfShares(long recordNoOfShares) {
        this.recordNoOfShares = recordNoOfShares;
    }
    /**
     * It contains tag values separated by delimiter
     */
    @Field("other_tag_values")
    private String otherTagValues;
    /**
     * It contains other tags which are not part of simple Dublin Core (Other
     * tags include Qualified dublin Core refined elements or elements not
     * defined by Dublin Core)
     */
    @Field("other_tag_json")
    private String otherTagJson;
    /**
     * markTaggingJson
     */
    @Field("markTaggingJson")
    private String markTaggingJson;

    // <editor-fold defaultstate="collapsed" >
    /**
     * give value of markTaggingJson property
     *
     * @return
     */
    public String getMarkTaggingJson() {
        return markTaggingJson;
    }

    /**
     * set value of markTaggingJson property
     *
     * @param markTaggingJson
     */
    public void setMarkTaggingJson(String markTaggingJson) {
        this.markTaggingJson = markTaggingJson;
    }

    /**
     * give value of rootElement property
     *
     * @return
     */
    public String getRootElement() {
        return rootElement;
    }

    /**
     * set value of rootElement property
     *
     * @param rootElement
     */
    public void setRootElement(String rootElement) {
        this.rootElement = rootElement;
    }

    /**
     * give value of prefix property
     *
     * @return
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * set value of prefix property
     *
     * @param prefix
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * give value of namespace property
     *
     * @return
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * set value of namespace property
     *
     * @param namespace
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * give value of udcNotation property
     *
     * @return
     */
    public String getUdcNotation() {
        return udcNotation;
    }

    /**
     * set value of udcNotation property
     *
     * @param udcNotation
     */
    public void setUdcNotation(String udcNotation) {
        this.udcNotation = udcNotation;
    }

    /**
     * give value of customNotation property
     *
     * @return
     */
    public String getCustomNotation() {
        return customNotation;
    }

    /**
     * set value of customNotation property
     *
     * @param customNotation
     */
    public void setCustomNotation(String customNotation) {
        this.customNotation = customNotation;
    }

    /**
     * give value of indexedFlag property
     *
     * @return
     */
    public boolean isIndexedFlag() {
        return indexedFlag;
    }

    /**
     * set value of indexedFlag property
     *
     * @param indexedFlag
     */
    public void setIndexedFlag(boolean indexedFlag) {
        this.indexedFlag = indexedFlag;
    }

    /**
     * give value of recordLikeCount property
     *
     * @return
     */
    public long getRecordLikeCount() {
        return recordLikeCount;
    }

    /**
     * set value of recordLikeCount property
     *
     * @param recordLikeCount
     */
    public void setRecordLikeCount(long recordLikeCount) {
        this.recordLikeCount = recordLikeCount;
    }

    /**
     * give value of recordViewCount property
     *
     * @return
     */
    public long getRecordViewCount() {
        return recordViewCount;
    }

    /**
     * set value of recordViewCount property
     *
     * @param recordViewCount
     */
    public void setRecordViewCount(long recordViewCount) {
        this.recordViewCount = recordViewCount;
    }

    /**
     * give value of recordNoOfDownloads property
     *
     * @return
     */
    public long getRecordNoOfDownloads() {
        return recordNoOfDownloads;
    }

    /**
     * set value of recordNoOfDownloads property
     *
     * @param recordNoOfDownloads
     */
    public void setRecordNoOfDownloads(long recordNoOfDownloads) {
        this.recordNoOfDownloads = recordNoOfDownloads;
    }

    /**
     * give value of crowdSourceFlag property
     *
     * @return
     */
    public boolean isCrowdSourceFlag() {
        return crowdSourceFlag;
    }

    /**
     * set value of crowdSourceFlag property
     *
     * @param crowdSourceFlag
     */
    public void setCrowdSourceFlag(boolean crowdSourceFlag) {
        this.crowdSourceFlag = crowdSourceFlag;
    }

    /**
     * give value of crowdSourceStageFlag property
     *
     * @return
     */
    public boolean isCrowdSourceStageFlag() {
        return crowdSourceStageFlag;
    }

    /**
     * set value of crowdSourceStageFlag property
     *
     * @param crowdSourceStageFlag
     */
    public void setCrowdSourceStageFlag(boolean crowdSourceStageFlag) {
        this.crowdSourceStageFlag = crowdSourceStageFlag;
    }

    /**
     * give value of recordIdentifier property
     *
     * @return
     */
    public String getRecordIdentifier() {
        return recordIdentifier;
    }

    /**
     * set value of recordIdentifier property
     *
     * @param recordIdentifier
     */
    public void setRecordIdentifier(String recordIdentifier) {
        this.recordIdentifier = recordIdentifier;
    }

    /**
     * give value of originalFileName property
     *
     * @return
     */
    public String getOriginalFileName() {
        return originalFileName;
    }

    /**
     * set value of originalFileName property
     *
     * @param originalFileName
     */
    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    /**
     * give value of title property
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * set value of title property
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * give value of description property
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set value of description property
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * give value of rights property
     *
     * @return
     */
    public String getRights() {
        return rights;
    }

    /**
     * set value of rights property
     *
     * @param rights
     */
    public void setRights(String rights) {
        this.rights = rights;
    }

    /**
     * give value of date property
     *
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     * set value of date property
     *
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * give value of format property
     *
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     * set value of format property
     *
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * give value of relation property
     *
     * @return
     */
    public String getRelation() {
        return relation;
    }

    /**
     * set value of relation property
     *
     * @param relation
     */
    public void setRelation(String relation) {
        this.relation = relation;
    }

    /**
     * give value of coverage property
     *
     * @return
     */
    public String getCoverage() {
        return coverage;
    }

    /**
     * set value of coverage property
     *
     * @param coverage
     */
    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    /**
     * give value of identifier property
     *
     * @return
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * set value of identifier property
     *
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * give value of subject property
     *
     * @return
     */
    public String getSubject() {
        return subject;
    }

    /**
     * set value of subject property
     *
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * give value of creator property
     *
     * @return
     */
    public String getCreator() {
        return creator;
    }

    /**
     * set value of creator property
     *
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * give value of publisher property
     *
     * @return
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * set value of publisher property
     *
     * @param publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * give value of source property
     *
     * @return
     */
    public String getSource() {
        return source;
    }

    /**
     * set value of source property
     *
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * give value of languages property
     *
     * @return
     */
    public String getLanguages() {
        return languages;
    }

    /**
     * set value of languages property
     *
     * @param languages
     */
    public void setLanguages(String languages) {
        this.languages = languages;
    }

    /**
     * give value of type property
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set value of type property
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * give value of contributor property
     *
     * @return
     */
    public String getContributor() {
        return contributor;
    }

    /**
     * set value of contributor property
     *
     * @param contributor
     */
    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    /**
     * give value of location property
     *
     * @return
     */
    public String getLocation() {
        return location;
    }

    /**
     * set value of location property
     *
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * give value of updatedOn property
     *
     * @return
     */
    public Date getUpdatedOn() {
        return updatedOn;
    }

    /**
     * set value of updatedOn property
     *
     * @param updatedOn
     */
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    /**
     * give value of createdOn property
     *
     * @return
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * set value of createdOn property
     *
     * @param createdOn
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * give value of otherTagValues property
     *
     * @return
     */
    public String getOtherTagValues() {
        return otherTagValues;
    }

    /**
     * set value of otherTagValues property
     *
     * @param otherTagValues
     */
    public void setOtherTagValues(String otherTagValues) {
        this.otherTagValues = otherTagValues;
    }

    /**
     * give value of otherTagJson property
     *
     * @return
     */
    public String getOtherTagJson() {
        return otherTagJson;
    }

    /**
     * set value of otherTagJson property
     *
     * @param otherTagJson
     */
    public void setOtherTagJson(String otherTagJson) {
        this.otherTagJson = otherTagJson;
    }

    public String getAccrualMethod() {
        return accrualMethod;
    }

    public void setAccrualMethod(String accrualMethod) {
        this.accrualMethod = accrualMethod;
    }

    public String getAccrualPeriodicity() {
        return accrualPeriodicity;
    }

    public void setAccrualPeriodicity(String accrualPeriodicity) {
        this.accrualPeriodicity = accrualPeriodicity;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getLccn() {
        return lccn;
    }

    public void setLccn(String lccn) {
        this.lccn = lccn;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getJsonView() {
        return jsonView;
    }

    public void setJsonView(String jsonView) {
        this.jsonView = jsonView;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }   
// </editor-fold>

    /**
     * Returns array of fields that would be used for searching.
     *
     * @return
     */
    public static String[] getSearchFields() {
        return new String[]{"record_identifier", "title", "description", "dc_date", "format", "identifier", "subject", "creator", "publisher", "languages",
            "lccn", "isbn", "source", "type", "contributor", "udcNotation", "custom_notation", "other_tag_values", "markTaggingJson", "f1", "f2", "f3", "f4", "f5", "f6", "f7", "f8", "f9", "f10"};
    }

    /**
     * Returns array of fields that would be used for highlighting search
     * results.
     *
     * <p>
     * NOTE: Highlighter needs setter and getter methods for getting and setting
     * data. Make sure that you have proper setter and getter methods defined
     * for listed fields. Setter method with only one String parameter is
     * accepted. eg:- title field should have 'getTitle()' and 'setTitle(String
     * title)' method.
     *
     * If you are highlighting filed that has been indexed by different name
     * that actual variable name, create duplicate setter and getter methods for
     * it. eg:- If you have 'searchTitle' as filter name, you will have two
     * setters getTitle(), getSearchTitle() and two setters setTitle(String
     * title) and setSearchTitle(String searchTitle).
     *
     * @return
     */
    public static String[] getSearchResultHighlightFields() {
        return new String[]{"title", "description", "subject", "creator", "publisher", "type", "contributor","dc_date"};
    }

    /**
     * Returns array of fields that would be used for Faceting search
     *
     * @return
     */
    public static String[] getFacetFields() {
        return new String[]{"facet_institution", "facet_creator", "facet_publisher", "facet_contributor", "facet_languages", "facet_date", "facet_format"};
    }

    /**
     * Returns array of fields that would be used for Specific Faceting search
     *
     * @return
     */
    public static String[] getSpecificFacetFields() {
        return new String[]{"Field-1", "Field-2", "Field-3", "Field-4", "Field-5", "Field-6", "Field-7", "Field-8", "Field-9", "Field-10"};
    }

    @Override
    public String toString() {
        return "AudioVideoPojo{" + "id=" + id + ", accrualMethod=" + accrualMethod + ", accrualPeriodicity=" + accrualPeriodicity + ", allowedLanguages=" + allowedLanguages + ", assignedTo=" + assignedTo + ", audience=" + audience + ", contributor=" + contributor + ", coverage=" + coverage + ", createdOn=" + createdOn + ", creator=" + creator + ", crowdSourceFlag=" + crowdSourceFlag + ", crowdSourceStageFlag=" + crowdSourceStageFlag + ", curationStatus=" + curationStatus + ", customNotation=" + customNotation + ", date=" + date + ", description=" + description + ", edition=" + edition + ", finalScore=" + finalScore + ", format=" + format + ", identifier=" + identifier + ", indexedFlag=" + indexedFlag + ", isbn=" + isbn + ", issn=" + issn + ", jsonView=" + jsonView + ", languages=" + languages + ", lccn=" + lccn + ", linkedWithArticleCount=" + linkedWithArticleCount + ", location=" + location + ", recordIdentifier=" + recordIdentifier + ", originalFileName=" + originalFileName + ", title=" + title + ", rights=" + rights + ", relation=" + relation + ", subject=" + subject + ", publisher=" + publisher + ", source=" + source + ", provenance=" + provenance + ", type=" + type + ", notes=" + notes + ", updatedOn=" + updatedOn + ", recordLikeCount=" + recordLikeCount + ", recordViewCount=" + recordViewCount + ", recordNoOfDownloads=" + recordNoOfDownloads + ", ratingCount=" + ratingCount + ", recordNoOfShares=" + recordNoOfShares + ", ratingScore=" + ratingScore + ", udcNotation=" + udcNotation + ", rootElement=" + rootElement + ", prefix=" + prefix + ", namespace=" + namespace + ", subResourceIdentifier=" + subResourceIdentifier + ", f1=" + f1 + ", f2=" + f2 + ", f3=" + f3 + ", f4=" + f4 + ", f5=" + f5 + ", f6=" + f6 + ", f7=" + f7 + ", f8=" + f8 + ", f9=" + f9 + ", f10=" + f10 + ", recordNoOfReview=" + recordNoOfReview + ", periodStart=" + periodStart + ", metadataStandard=" + metadataStandard + ", localObjectAvailable=" + localObjectAvailable + ", otherTagValues=" + otherTagValues + ", otherTagJson=" + otherTagJson + ", markTaggingJson=" + markTaggingJson + '}';
    }
    
    
}
