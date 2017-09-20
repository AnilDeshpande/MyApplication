//
//  ViewController.swift
//  SimpleListView
//
//  Created by Mohammed Afsul Mohammed Hussain on 20/09/17.
//  Copyright © 2017 Shell. All rights reserved.
//

import UIKit

class ViewController: UITableViewController {
    
    
    let data = [(title: "Brunch this weekend?",subtitle: "Ali Connoros - I'll be in your neightbourhood ..."),(title: "Summer BBQ 4",subtitle: "to Alex, Scott, Jennifer - Wish I could ..."),(title: "Oui Oui",subtitle: "Sandra Adams - Do you have Paris reco ...")]
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        //listTableView?.register(SimpleListCell.self, forCellReuseIdentifier: "ListCell")
        
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return data.count
    }
    
    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        
        let cell = tableView.dequeueReusableCell(withIdentifier: "ListCell", for: indexPath)
        
        let d = data[indexPath.row]
        cell.textLabel?.text = d.title
        cell.detailTextLabel?.text = d.subtitle
        
        let imageName = UIImage(named: "Person")
        cell.imageView?.image = imageName
        
        return cell
    }

}

