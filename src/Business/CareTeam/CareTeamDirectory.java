/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.CareTeam;

import java.util.ArrayList;

/**
 *
 * @author nirav gupta
 */
public class CareTeamDirectory {
    
    private ArrayList<CareTeamMember> careTeamMemberList;
    
    public CareTeamDirectory(){
        careTeamMemberList= new ArrayList();
    }

    public ArrayList<CareTeamMember> getCareTeamMemberList() {
        return careTeamMemberList;
    }

    public void setCareTeamMemberList(ArrayList<CareTeamMember> careTeamMemberList) {
        this.careTeamMemberList = careTeamMemberList;
    }

   

    public CareTeamMember addCareTeamMemberToMemberDirectory(){
                CareTeamMember ctm = new CareTeamMember();
                careTeamMemberList.add(ctm);
                return ctm;
            }
    
    public void addCareTeamMemberAsSpecified(CareTeamMember ctm){
                careTeamMemberList.add(ctm);
    }
    
    public void removeCareTeamMemberToMemberDirectory(CareTeamMember p) {
        careTeamMemberList.remove(p);
    }
    
//    public CareTeamMember createPerson(String name){
////    CareTeamMember p = new CareTeamMember();
////    p.setFirstName(name);
////    personList.add(p);
////    p.s
//    return p;
//}
    
}
