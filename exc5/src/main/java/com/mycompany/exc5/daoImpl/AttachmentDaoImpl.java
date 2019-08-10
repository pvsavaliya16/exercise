package com.mycompany.exc5.daoImpl;

import com.mycompany.exc5.Util.EntityManagerUtil;
import com.mycompany.exc5.Util.MethodUtil;
import com.mycompany.exc5.dao.AttachmentDao;
import com.mycompany.exc5.model.Attachment;
import com.mycompany.exc5.model.Proposal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author parth
 */
public class AttachmentDaoImpl implements AttachmentDao{

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();
    
    @Override
    public void addAttachment(Attachment attachment) {
        MethodUtil.addEntity(attachment);
    }

    @Override
    public List<Attachment> getAllAttachments() {
 List<Attachment> list = new ArrayList<>();
        try {
            list = entityManager.createQuery("SELECT a from Attachment a", Attachment.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;    }
    
}
