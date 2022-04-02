import { Component } from "react"

export default class AddSlot extends Component{

    constructor()
    {
        super()
        this.state={slot_id:0, slot_Date:'',slot_End_Time:'',slot_Start_Time:'',appointments:[],doctor:0,hospital:0}
       
    }

    sendPatient=(e)=>
    {
        fetch("http://localhost:8080/patient/bookSlot/", {
            "method": "POST",
            "headers":{'Content-Type':'application/json'},
            "body": JSON.stringify({
			patient_Name: this.state.patient_name,
			patient_DOB: this.state.patient_DOB,
			patient_Gender: this.state.patient_gender,
			patient_Mobile_number:this.state.patient_Mobile_Number,
			patient_Email:this.state.patient_Email,
			patient_Username:this.state.patient_Username,
			patient_Password:this.state.patient_Password


           })
          })
         
    }

    render()
    {
    return(
        <>

        </>
    )
}
}