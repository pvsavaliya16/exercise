package com.mycompany.exc5.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author parth
 */
@Entity
@Table(name = "proposal")
public class Proposal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "doc_id")
    private Long docId ;
    
    @Column(name = "title")
    private String title ;
    
    @Column(name = "comment")
    private String comment;
    
    @OneToMany(mappedBy = "proposal", cascade = CascadeType.ALL)
    @Column(name = "personnel_id")
    private Set<Personnel> personnel;
    
    @OneToMany(mappedBy = "proposal", cascade = CascadeType.ALL)
    @Column(name = "attachment_id")
    private Set<Attachment> attachment;

    public Proposal() {
    }

    public Proposal(String title, String comment) {
        this.title = title;
        this.comment = comment;
    }

    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Set<Personnel> getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Set<Personnel> personnel) {
        this.personnel = personnel;
    }

    public Set<Attachment> getAttachment() {
        return attachment;
    }

    public void setAttachment(Set<Attachment> attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this,
            ToStringStyle.MULTI_LINE_STYLE, true, true);
    }

    
}
