//
//  ViewController.swift
//  jackPlayground
//
//  Created by Jack on 10/8/20.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        //HUD Display Initalization
        fuelGauge.image = UIImage(named: "Fuel_Bar_8")
        weaponDisplay.image = UIImage(named: "Weapons")
        shieldMonitor.image = UIImage(named: "Shield0")
        //Top Monitor Instantiation
        leftIndicator.image = UIImage(named: "Indicator_G0")
        midIndicator.image = UIImage(named: "Indicator_G0")
        rightIndicator.image = UIImage(named: "Indicator_G0")
        //HUD label Instantiation
        leftLabel.text = "Shields"
        rightLabel.text = "Fuel Gauge"
        bttmLeftLabel.text = "Weapons"
        //Shield Percent Initialization
        shieldPercent.text = "0%"
        //Weapon Count Initialization
        torpCount.text = "x20"
        grenCount.text = "X10"
        lazrCount.text = "x200"
        
    }
    //Top and bottom bars
    @IBOutlet weak var topBar: UIView!
    @IBOutlet weak var bottomBar: UIView!
    //HUD Displays
    @IBOutlet weak var fuelGauge: UIImageView!
    @IBOutlet weak var weaponDisplay: UIImageView!
    @IBOutlet weak var shieldMonitor: UIImageView!
    //top indicators
    @IBOutlet weak var leftIndicator: UIImageView!
    @IBOutlet weak var midIndicator: UIImageView!
    @IBOutlet weak var rightIndicator: UIImageView!
    //HUD Labels
    @IBOutlet weak var leftLabel: UILabel!
    @IBOutlet weak var rightLabel: UILabel!
    @IBOutlet weak var bttmLeftLabel: UILabel!
    //Shield Percent
    @IBOutlet weak var shieldPercent: UILabel!
    //Weapoms Counts
    @IBOutlet weak var torpCount: UILabel!
    @IBOutlet weak var grenCount: UILabel!
    @IBOutlet weak var lazrCount: UILabel!
    
    
    
    //Buttons
    @IBAction func shieldButton(_ sender: Any) {
    }
    @IBAction func weaponButton(_ sender: Any) {
    }
    @IBAction func scramButton(_ sender: Any) {
    }
    @IBAction func fuelButton(_ sender: Any) {
    }
    
}

