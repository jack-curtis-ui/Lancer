//
//  ViewController.swift
//  Adventure_1
//
//  Created by Benjamin Blackwell on 9/8/20.
//  Copyright © 2020 Tom Gillis SVII. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        //Dispose ofresources that can be recreated
    }
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
    //Main Image
    @IBOutlet weak var centerImage: UIImageView!
    //Bar containing Buttons
    @IBOutlet weak var buttonBar: UIView!
    @IBOutlet weak var bottomBar: UIView!
    //Bar containing red green monitors
    @IBOutlet weak var topBar: UIView!
    //Right Indicator
    @IBOutlet weak var rightIndicator: UIImageView!
    //Mid Indicator
    @IBOutlet weak var midIndicator: UIImageView!
    //Left Indicator
    @IBOutlet weak var leftIndicator: UIImageView!
    
    //Fuel Gauge
    @IBOutlet weak var fuelLabel: UILabel!
    @IBOutlet weak var fuelGauge: UIImageView!
    //Shield display
    @IBOutlet weak var shieldLabel: UILabel!
    @IBOutlet weak var shieldMonitor: UIImageView!
    //Weapons Display
    @IBOutlet weak var weaponLabel: UILabel!
    @IBOutlet weak var weaponMonitor: UIImageView!
    
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


    
    

