package com.mycompany.exc5.model;

import java.sql.Blob;
import java.sql.Timestamp;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author parth
 */
@Entity
@Table(name = "attachment")
public class Attachment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "attachment_id")
    private Long attachmentId;
    
    @Column(name = "file_name")
    private String fileName;
    
    @Column(name = "file_size")
    private String fileSize;
    
    @Column(name = "created_on")
    private Timestamp created;
    
    @Column(name = "attachment_bytes")
    private Blob attachmentBytes; 
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Personnel personnel;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Proposal proposal;

    public Attachment() {
    }

    public Attachment(String fileName, String fileSize, Timestamp created, Blob attachmentBytes) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.created = created;
        this.attachmentBytes = attachmentBytes;
    }

    public Long getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Long attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Blob getAttachmentBytes() {
        return attachmentBytes;
    }

    public void setAttachmentBytes(Blob attachmentBytes) {
        this.attachmentBytes = attachmentBytes;
    }

    public Personnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }

    public Proposal getProposal() {
        return proposal;
    }

    public void setProposal(Proposal proposal) {
        this.proposal = proposal;
    }

    
    
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this,
            ToStringStyle.MULTI_LINE_STYLE, true, true);
    }
    
    
}
