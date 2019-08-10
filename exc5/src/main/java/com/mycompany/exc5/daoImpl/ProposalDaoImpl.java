package com.mycompany.exc5.daoImpl;

import com.mycompany.exc5.Util.EntityManagerUtil;
import com.mycompany.exc5.Util.MethodUtil;
import com.mycompany.exc5.dao.ProposalDao;
import com.mycompany.exc5.model.Proposal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author parth
 */
public class ProposalDaoImpl implements ProposalDao{

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();
    
    @Override
    public void addProposal(Proposal proposal) {
        MethodUtil.addEntity(proposal);
    }

    @Override
    public List<Proposal> getAllProposals() {
        List<Proposal> list = new ArrayList<>();
        try {
            list = entityManager.createQuery("SELECT p from Proposal p", Proposal.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
