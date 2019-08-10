package com.mycompany.exc5;

import com.mycompany.exc5.dao.AttachmentDao;
import com.mycompany.exc5.dao.PersonnelDao;
import com.mycompany.exc5.dao.ProposalDao;
import com.mycompany.exc5.daoImpl.AttachmentDaoImpl;
import com.mycompany.exc5.daoImpl.PersonnelDaoImpl;
import com.mycompany.exc5.daoImpl.ProposalDaoImpl;
import com.mycompany.exc5.model.Attachment;
import com.mycompany.exc5.model.Proposal;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author parth
 */
public class AppMain {

    private static ProposalDao proposalDao= new ProposalDaoImpl();
    private static AttachmentDao attachmentDao = new AttachmentDaoImpl();
    private static PersonnelDao personnelDao = new PersonnelDaoImpl();
    
    public static void main(String[] args) throws SQLException {
//        Set<Personnel> personnelSet1 = new HashSet<>();
//        Set<Personnel> personnelSet2 = new HashSet<>();
//
//        Set<Proposal> proposalSet1 = new HashSet<>();
//        Set<Proposal> proposalSet2 = new HashSet<>();
//
//        Set<Attachment> attachmentSet1 = new HashSet<>();
//        Set<Attachment> attachmentSet2 = new HashSet<>();
//
//        byte[] b = new byte[3];
//        b[0] = 1;
//        b[1] = 2;
//        b[2] = 3;
//        Blob blob = new SerialBlob(b);
//
//        Personnel ps1 = new Personnel("Parth", Qualification.INTERMEDIATE, "9876543210");
//        Personnel ps2 = new Personnel("Vaibhav", Qualification.INTERMEDIATE, "9999999999");
//        Personnel ps3 = new Personnel("Akash", Qualification.PRO, "8888888888");
//        
//        Proposal pr1 = new Proposal("New Project", "Best Project");
//        Proposal pr2 = new Proposal("Second Project", "Another Project");
//        Proposal pr3 = new Proposal("Third Project", "last Project");
//
//        Attachment a1 = new Attachment("abc", "50", new Timestamp(546321894), blob);
//        Attachment a2 = new Attachment("def", "50", new Timestamp(563461894), blob);
//        Attachment a3 = new Attachment("ghi", "50", new Timestamp(578321894), blob);
//        Attachment a4 = new Attachment("jkl", "50", new Timestamp(578321324), blob);
//        
//        a4.setPersonnel(ps2);
//        a2.setPersonnel(ps1);
//        
//       
//        
//        personnelSet1.add(ps1);
//        personnelSet1.add(ps2);
//
//        personnelSet2.add(ps3);
//        personnelSet2.add(ps2);
//
//        proposalSet1.add(pr3);
//        proposalSet1.add(pr2);
//
//        proposalSet2.add(pr1);
//        proposalSet2.add(pr2);
//
//        a4.setProposal(pr1);
//        a2.setProposal(pr1);
//        
//        a1.setProposal(pr2);
//        a3.setProposal(pr2);
//       
//        ps1.setProposal(pr1);
//        ps2.setProposal(pr2);
//        ps3.setProposal(pr2);
//        
//        attachmentSet1.add(a4);
//        attachmentSet1.add(a2);
//        attachmentSet2.add(a1);
//        attachmentSet2.add(a3);
//        
//        pr1.setPersonnel(personnelSet1);
//        pr2.setPersonnel(personnelSet2);
//        pr1.setAttachment(attachmentSet1);
//        pr2.setAttachment(attachmentSet2);
//        
//        proposalDao.addProposal(pr1);
//        proposalDao.addProposal(pr2);

          List<Attachment> propList =attachmentDao.getAllAttachments();
          
          System.out.println(propList);
    }
}
