package com.sahil.generics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) 
    {
        List<Father> fatherList = new ArrayList<Father>();
        
        Father father1 =  new Father();
        father1.setName("john");
        father1.setAge(25); //***Father object creation successful ***
        
        fatherList.add(father1);

        List <Children> childrensList = new ArrayList<Children>();
        
        Children children1 = new Children(); //Children 1*****
        children1.setName("david");
        children1.setAge(2);
        
        Children children2 = new Children(); //Children 2*****
        children2.setAge(2);
        children2.setName("Arnold");
        
        childrensList.add(children1);//adding Children 1 and Children 2**********
        childrensList.add(children2);// into the list of children
        
        father1.setChildrensList(childrensList);//***********IMP*******
        
        //List of grand children
        List<GrandChildren> grandChildenList = new ArrayList<GrandChildren>();
        
        /*
         * Grand Children Additional Info 
         */
        List<AddInfo> additionalInfoList =  new ArrayList<AddInfo>();
        
        AddInfo ai1 = new AddInfo();
        ai1.setgAddress("Railway Etawah");
        ai1.setgEmail("sahil@gmail.com");
        ai1.setgRollNumber("61");
        
        AddInfo ai2 = new AddInfo();
        ai2.setgAddress("Railway Colony Etw");
        ai2.setgEmail("sahil@gmail.com");
        ai2.setgRollNumber("63");
        
        additionalInfoList.add(ai1);
        additionalInfoList.add(ai2);
         
        /*
         * Grand Children Tution Info 
         */
        List<Tution> tutionInfoList = new ArrayList<Tution>();
        Tution tution1 = new Tution();
        tution1.setTutionAddress("Chaugurgi Etawah");
        tution1.setTutionFee(500);
        tution1.setTutionName("Physics");
        
        Tution tution2 = new Tution();
        tution2.setTutionAddress("Chaugurgi Etawah");
        tution2.setTutionFee(500);
        tution2.setTutionName("Chemistry");
        
        Tution tution3 = new Tution();
        tution3.setTutionAddress("Station Road");
        tution3.setTutionFee(500);
        tution3.setTutionName("MATHS");
        
        tutionInfoList.add(tution1);
        tutionInfoList.add(tution2);
        tutionInfoList.add(tution3);
        
        
        GrandChildren gc1 = new GrandChildren();
        gc1.setgID(1);
        gc1.setgAge(1);
        gc1.setGrandChildName("Smith");// grand children 1
        gc1.setAdditionalInfo(additionalInfoList);
        gc1.setTutions(tutionInfoList);
        
        GrandChildren gc2 = new GrandChildren();
        gc2.setgID(2);
        gc2.setgAge(11);
        gc2.setGrandChildName("Williams");// grand children 2
        gc2.setAdditionalInfo(additionalInfoList);
        gc2.setTutions(tutionInfoList);
        
        
        grandChildenList.add(gc1);
        grandChildenList.add(gc2);
        
        father1.setGrandChilds(grandChildenList);//***********IMP*******
        
        for (Father f : fatherList) 
        {
        	if(f.getChildrensList().size()>0 && f.getChildrensList().size()>0)
        	{
        	System.out.println("----------------Father---------------");
            System.out.println("Father Name : " + f.getName());
            System.out.println("Father Age : "+f.getAge());
            
            	for (Children c : f.getChildrensList()) 
            	{
            	System.out.println("----------------Children---------------");
                System.out.println("Children Name : "+c.getName());
                System.out.println("Children Age : "+c.getAge());
            	}
            
            	for (int i = 0; i < grandChildenList.size(); i++) 
            	{
            	System.out.println("----------Grand Children----------------");
            	GrandChildren grandCh = grandChildenList.get(i);
            	System.out.println("Grand Children Name : "+grandCh.getGrandChildName());
            	System.out.println("Grand Children ID : "+grandCh.getgID());
            	System.out.println("Grand Children Age : "+grandCh.getgAge());
            	}
        	}
        }
      /*
       *  Doing for GrandChildrens
       */
        for (GrandChildren g : grandChildenList) 
        {
        	System.out.println("GrandChildren ID  :"+g.getgID());
        	System.out.println("GrandChildren Name : "+g.getGrandChildName());
        	System.out.println("GrandChildren Age : "+g.getgAge());

        	for (Tution tution : tutionInfoList) 
        	{
        		System.out.println("*****Tution**************");
				System.out.println("Tution Info"+tution.getTutionAddress());
				System.out.println("Tution Name "+tution.getTutionName());
				System.out.println("Tution Fee"+tution.getTutionFee());
        		
			}
        	for (AddInfo addInfo :additionalInfoList) 
        	{
				System.out.println("**additional Info");
				System.out.println("Roll Number : "+addInfo.getgRollNumber());
				System.out.println("Email : "+addInfo.getgEmail());
				System.out.println("Address : "+addInfo.getgAddress());
        	}
        }	
      }
    }