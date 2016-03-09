package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
//import org.springframework.stereotype.Repository;
//
//import javax.annotation.PostConstruct;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;

/**
 * Created by PiratePowWow on 3/9/16.
 */
@Controller
public class OrmOmgController {
    @Autowired
    CustomerRepository customers;
    @Autowired
    PurchaseRepository purchases;
//    @PostConstruct
//    public void populateDatabase() throws FileNotFoundException {
//        File c = new File("customers.csv");
//        Scanner s = new Scanner(c);
//        s.nextLine();
//        while(s.hasNext()){
//            String[] a = s.nextLine().split(",");
//            customers.save(new Customer(a[0], a[1]));
//        }
//        File p = new File("purchases.csv");
//        Scanner pur = new Scanner(p);
//        pur.nextLine();
//        while(pur.hasNext()){
//            String[] pr = pur.nextLine().split(",");
//            purchases.save(new Purchase(customers.findOne(Integer.valueOf(pr[0])), pr[1], pr[2], pr[3], pr[4]));
//        }
//
//    }
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model, String category){
        if (category!= null){
            model.addAttribute("purchases", purchases.findByCategory(category));
        }else{
            model.addAttribute("purchases", purchases.findAll());
        }

        return "home";
    }
//    @RequestMapping(path = "/login", method = RequestMethod.POST)
//    public String login(){
//        return "redirect:/";
//    }
//    @RequestMapping(path = "/add-purchase", method = RequestMethod.POST)
//    public String addPurchase(){
//        return "redirect:/";
//    }
//    @RequestMapping(path = "/update-purchase", method = RequestMethod.POST)
//    public String updatePurchase(){
//        return "redirect:/";
//    }
//    @RequestMapping(path = "/delete-purchase", method = RequestMethod.POST)
//    public String deletePurchase(){
//        return "redirect:/";
//    }

}
