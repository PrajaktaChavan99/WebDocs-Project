import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import log from '../UI/assets/img/log.jpeg';
import logo from '../UI/assets/img/logo.png';
export default class DoctorProfile extends React.Component{


    constructor()
    {
        super()
        this.state={startTime:'',endTime:'',date:'',slots:[]}
       
    }
    
    

    // const[doctor,setDoctor] = useState([])

    // useEffect(()=>{
    //     const doctor= JSON.parse(localStorage.getItem('doctor'));
    //     if(doctor){
    //         setDoctor(doctor)
    //         console.log(doctor)
    //     }
        

    // },[]);

    // var doc1 = JSON.parse(props.doc)
    // console.log(doc1)


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

render(){
    return(
            


     <div>
        <div className="breadcrumb-bar">
            <div className="container-fluid">
                <div className="row align-items-center">
                    <div className="col-md-12 col-12">
                        <nav aria-label="breadcrumb" className="page-breadcrumb">
                            <ol className="breadcrumb">
                                <li className="breadcrumb-item"><a href="index-2.html">Home</a></li>
                                <li className="breadcrumb-item active" aria-current="page">Schedule Timings</li>
                            </ol>
                        </nav>
                        <h2 className="breadcrumb-title">Schedule Timings</h2>
                    </div>
                </div>
            </div>
        </div>
  
    
        <div className="content">
            <div className="container-fluid">

                <div className="row">
                    <div className="col-md-5 col-lg-4 col-xl-3 theiaStickySidebar">
                    
                       
                        <div className="profile-sidebar">
                            <div className="widget-profile pro-widget-content">
                                <div className="profile-info-widget">
                                    <a href="#" className="booking-doc-img">
                                        <img src="assets/img/doctors/doctor-thumb-02.jpg" alt="User Image"/>
                                    </a>
                                    <div className="profile-det-info">
                                        <h3>Doctor's name</h3>
                                        
                                        <div className="patient-details">
                                            <h5 className="mb-0">Doctor's Degree and info</h5>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div className="dashboard-widget">
                                <nav className="dashboard-menu">
                                    <ul>	
                                        <li>
                                            <a href="appointments.html">
                                                <i className="fas fa-calendar-check"></i>
                                                <span>Appointments</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="my-patients.html">
                                                <i className="fas fa-user-injured"></i>
                                                <span>My Patients</span>
                                            </a>
                                        </li>
                                        <li className="active">
                                            <a href="schedule-timings.html">
                                                <i className="fas fa-hourglass-start"></i>
                                                <span>Schedule Timings</span>
                                            </a>
                                        </li>
                                        
                                        <li>
                                            <a href="reviews.html">
                                                <i className="fas fa-star"></i>
                                                <span>Reviews</span>
                                            </a>
                                        </li>
                                        
                                        <li>
                                            <a href="doctor-profile-settings.html">
                                                <i className="fas fa-user-cog"></i>
                                                <span>Profile Settings</span>
                                            </a>
                                        </li>
                                        
                                        <li>
                                            <a href="doctor-change-password.html">
                                                <i className="fas fa-lock"></i>
                                                <span>Change Password</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="index-2.html">
                                                <i className="fas fa-sign-out-alt"></i>
                                                <span>Logout</span>
                                            </a>
                                        </li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                        
                        
                    </div>
                    
                    <div className="col-md-7 col-lg-8 col-xl-9">
                     
                        <div className="row">
                            <div className="col-sm-12">
                                <div className="card">
                                    <div className="card-body">
                                        <h4 className="card-title">Schedule Timings</h4>
                                        <div className="profile-box">
                                            <div className="row">

                                                <div className="col-lg-4">
                                                    <div className="form-group">               
                                                        <label>Timing Slot Duration</label>
                                                        <label>30 min</label>
                                                    </div>
                                                </div>

                                            </div>     
                                            <div className="row">
                                                <div className="col-md-12">
                                                    <div className="card schedule-widget mb-0">
                                                    
                                                       
                                                        <div className="schedule-header">
                                                        
                                                           
                                                            <div className="schedule-nav">
                                                                <ul className="nav nav-tabs nav-justified">
                                                                    <li className="nav-item">
                                                                        <a className="nav-link" data-toggle="tab" href="#slot_sunday">Sunday</a>
                                                                    </li>
                                                                    <li className="nav-item">
                                                                        <a className="nav-link active" data-toggle="tab" href="#slot_monday">Monday</a>
                                                                    </li>
                                                                    <li className="nav-item">
                                                                        <a className="nav-link" data-toggle="tab" href="#slot_tuesday">Tuesday</a>
                                                                    </li>
                                                                    <li className="nav-item">
                                                                        <a className="nav-link" data-toggle="tab" href="#slot_wednesday">Wednesday</a>
                                                                    </li>
                                                                    <li className="nav-item">
                                                                        <a className="nav-link" data-toggle="tab" href="#slot_thursday">Thursday</a>
                                                                    </li>
                                                                    <li className="nav-item">
                                                                        <a className="nav-link" data-toggle="tab" href="#slot_friday">Friday</a>
                                                                    </li>
                                                                    <li className="nav-item">
                                                                        <a className="nav-link" data-toggle="tab" href="#slot_saturday">Saturday</a>
                                                                    </li>
                                                                </ul>
                                                            </div>
                                                          
                                                            
                                                        </div>
                                                        
                                                        <div className="tab-content schedule-cont">
                                                        
                                                           
                                                            <div id="slot_sunday" className="tab-pane fade">
                                                                <h4 className="card-title d-flex justify-content-between">
                                                                    <span>Time Slots</span> 
                                                                    <a className="edit-link" data-toggle="modal" href="#add_time_slot"><i className="fa fa-plus-circle"></i> Add Slot</a>
                                                                </h4>
                                                                <p className="text-muted mb-0">Not Available</p>
                                                            </div>
                                                            

                                                           
                                                            <div id="slot_monday" className="tab-pane fade show active">
                                                                <h4 className="card-title d-flex justify-content-between">
                                                                    <span>Time Slots</span> 
                                                                    <a className="edit-link" data-toggle="modal" href="#edit_time_slot"><i className="fa fa-edit mr-1"></i>Edit</a>
                                                                </h4>
                                                                
                                                               
                                                                {this.state.slots.map((e)=>{
                                                                    return(
                                                                        <div className="doc-times">
                                                                    <div className="doc-slot-list">
                                                                        {e.startTime+"-"+e.endTime}
                                                                        
                                                                            <i className="fa fa-times"></i>
                                                                        
                                                                    </div>
                                                                    
                                                                </div>
                                                                    )
                                                                })}
                                                                
                                                            </div>
                                                            
                                                            
                               
                                                        </div>
                                                       
                                                        
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                            
                    </div>
                </div>

            </div>

        </div>		
        </div>

    )
}
}