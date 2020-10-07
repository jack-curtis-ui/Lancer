//
//  ViewController.swift
//  Adventure_1
//
//  Created by Benjamin Blackwell on 9/8/20.
//  Copyright © 2020 Tom Gillis SVII. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        shieldPercent.text = "0%"
        torpCount.text = "x10"
        grenCount.text = "x5"
        lazrCount.text = "x200"
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        //Dispose ofresources that can be recreated
    }
    //Shields Menu Action
    @IBAction func shieldMenu(_ sender: Any) {
        shieldPercent.text = "100%"
    }
    //Shield percentage label
    @IBOutlet weak var shieldPercent: UILabel!
    
    //Weapon Menu Action
    @IBAction func weaponMenu(_ sender: Any) {
    }
    //Quantum Torpedo Count
    @IBOutlet weak var torpCount: UILabel!
    //Concussion Grenade Count
    @IBOutlet weak var grenCount: UILabel!
    //Lazer Count
    @IBOutlet weak var lazrCount: UILabel!
    //Activate Scram Action
    @IBAction func scamButton(_ sender: Any) {
    }
    //Check Fuel Action
    @IBAction func checkFuel(_ sender: Any) {
    }
    
    
}


    
    

