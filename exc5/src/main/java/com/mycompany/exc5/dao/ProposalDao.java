package com.mycompany.exc5.dao;

import com.mycompany.exc5.model.Proposal;
import java.util.List;

/**
 *
 * @author parth
 */
public interface ProposalDao {
    public void addProposal(Proposal proposal);
    
    public List<Proposal> getAllProposals();
}
