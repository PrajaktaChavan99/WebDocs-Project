import { Component } from "react";

export default class WithoutCss extends Component{
    constructor()
    {
        super()
        this.state={startTime:'',endTime:'',date:'', patient_Name:'', patient:[] , slots:[]}
       
    }
    componentDidMount()
    {
        console.log("here")
         fetch("http://localhost:8080/slot/getAll", {
                       "method": "GET",
                     }).then(response => {
                    //   console.log(response.json()) 
                      
                         return response.json()      
                    }).then(jsondataarr => {
                       this.setState({
                        slots: jsondataarr 

                       } )})
                       console.log(this.state.slots)
                     
    }
    render()
    {
        return(
            <div>
            {this.state.slots.map((e,i)=>{
                return (

                   <div className="patient-details" key={i}>
                       <h3>Slot ID : {e.slot_id}</h3>
                       
                       <p>Start Time : <span>{e.slot_Start_Time}</span></p>
                       <p>End Time : <span>{e.slot_End_Time}</span></p>
                       <p>Date : <span>{e.slot_Date}</span></p>
                   </div>

           )})}
           
           </div> )
          
        
    }
}