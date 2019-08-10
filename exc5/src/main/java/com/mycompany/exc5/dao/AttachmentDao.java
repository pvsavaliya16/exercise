package com.mycompany.exc5.dao;

import com.mycompany.exc5.model.Attachment;
import java.util.List;

/**
 *
 * @author parth
 */
public interface AttachmentDao {
    
    public void addAttachment(Attachment attachment);
    
    public List<Attachment> getAllAttachments();
}
