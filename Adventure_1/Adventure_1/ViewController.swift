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
        //setting shields
        shieldPercent.text = "0%"
        //loading weapons
        torpCount.text = "x10"
        grenCount.text = "x5"
        lazrCount.text = "x200"
        //filling fuel tank
        fuelGauge.image = UIImage(named: "Fuel_Bar_8")
        //Starting shileds empty
        shieldMonitor.image = UIImage(named: "Shield0")
        //Getting weapons image
        weaponMonitor.image = UIImage(named: "Weapons")
    }
    //Fuel Gauge
    @IBOutlet weak var fuelGauge: UIImageView!
    //Shield display
    @IBOutlet weak var shieldMonitor: UIImageView!
    //Weapons Display
    @IBOutlet weak var weaponMonitor: UIImageView!
    
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


    
    

