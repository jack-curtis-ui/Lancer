//
//  ViewController.swift
//  Lancer
//
//  Created by Jack on 10/8/20.
//

import UIKit

class ViewController: UIViewController {

    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        //Loading fuel bar
        fuelImages += [UIImage(named: "Fuel_Bar_0")!, UIImage(named: "Fuel_Bar_1")!, UIImage(named: "Fuel_Bar_2")!, UIImage(named: "Fuel_Bar_3")!, UIImage(named: "Fuel_Bar_4")!, UIImage(named: "Fuel_Bar_5")!, UIImage(named: "Fuel_Bar_6")!, UIImage(named: "Fuel_Bar_7")!, UIImage(named: "Fuel_Bar_8")!]
        //Loading shield monitor
        shieldImages += [UIImage(named: "Shield0")!, UIImage(named: "Shield20")!, UIImage(named: "Shield40")!, UIImage(named: "Shield60")!, UIImage(named: "Shield80")!, UIImage(named: "Shield100")!]
        //HUD Display Initalization
        fuelGauge.image = fuelImages[8]
        weaponDisplay.image = UIImage(named: "Weapons")
        shieldMonitor.image = shieldImages[0]
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
        
        //Fuel Rods
        fuelRods = 20
        //Shield status
        shieldStatus = 100
        
        
        
    }
    //Views
    @IBOutlet weak var topBar: UIView!
    @IBOutlet weak var bottomBar: UIView!
    @IBOutlet var centerView: [UIView]!
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
    
    //declaring image arrays
    var fuelImages: [UIImage] = []
    var shieldImages: [UIImage] = []
    
    var fuelRods: Int = 0
    var shieldStatus: Int = 0
    
    //setter function for adjusting fuel bar
    func setFuel(fuelRods:Int){
        switch fuelRods {
            case 20:
                fuelGauge.image = fuelImages[8]
                break
            case 18...19:
                fuelGauge.image = fuelImages[7]
                break
            case 15...17:
                fuelGauge.image = fuelImages[6]
                break
            case 12...14:
                fuelGauge.image = fuelImages[5]
                break
            case 9...11:
                fuelGauge.image = fuelImages[4]
                break
            case 6...8:
                fuelGauge.image = fuelImages[3]
                break
            case 3...5:
                fuelGauge.image = fuelImages[2]
                break
            case 1...2:
                fuelGauge.image = fuelImages[1]
                break
            case 0:
                fuelGauge.image = fuelImages[0]
                break
            default:
                break
        }
    }
    
    func setShield(shieldStatus: Int){
        switch shieldStatus {
            case 81...100:
                shieldMonitor.image = shieldImages[5]
                break
            case 61...80:
                shieldMonitor.image = shieldImages[4]
                break
            case 41...60:
                shieldMonitor.image = shieldImages[3]
                break
            case 21...40:
                shieldMonitor.image = shieldImages[2]
                break
            case 1...20:
                shieldMonitor.image = shieldImages[1]
                break
            case 0:
                shieldMonitor.image = shieldImages[0]
                break
            default:
                break
        }
    }
    //Buttons
    @IBAction func weaponButton(_ sender: Any) {
    }
    @IBAction func scramButton(_ sender: Any) {
    }
    @IBAction func fuelButton(_ sender: Any) {
        
    }
    @IBAction func shieldButton(_ sender: Any) {
        shieldMonitor.image = shieldImages[5]
        shieldPercent.text = "100%"
        //reducing fuel
        fuelRods-=1
        setFuel(fuelRods: fuelRods)
    }
    
}

