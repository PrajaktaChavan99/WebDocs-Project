
import { useState } from 'react';
import { Link } from 'react-router-dom';
import login from '../UI/assets/img/login-banner.png';
import DoctorProfile from './DoctorProfile';
import Navbar from './Navbar';
export default function DoctorLogin(){

    const [doctorUsername,setDoctorUsername] = useState('');
    const [doctorPassword,setDoctorPassword] = useState('');
	const [doctor,setDoctors] = useState([]);

	let verifyDoctor=()=>
    {
		
       
        var promise = fetch(`http://localhost:8080/doctor/login/`+doctorUsername+"/"+doctorPassword, {
                       "method": "POST",
                     })
        var anotherpromise =promise.then(response => {
			// console.log(response.json())
                         return response.json()
                    })
        anotherpromise.then(jsondataarr => {
			
				setDoctors(
                      jsondataarr
					  
                        );console.log("anotherpromise"+doctor)})
					   

                     
        promise.catch(err => { console.log(err); 
                     });
					 
					 localStorage.setItem("doctor",JSON.stringify(doctor))
					 console.log(localStorage.getItem('doctor'))
					 
    }

    return(
		<div>
			<Navbar></Navbar>
        <div className="content">
				<div className="container-fluid">
					
					<div className="row">
						<div className="col-md-8 offset-md-2">
							
							
							<div className="account-content">
								<div className="row align-items-center justify-content-center">
									<div className="col-md-7 col-lg-6 login-left">
										<img src={login} className="img-fluid" alt="Doccure Login"/>	
									</div>
									<div className="col-md-12 col-lg-6 login-right">
										<div className="login-header">
											
                                            <h3>Doctor's Login<a href="/patientlogin">Not a Doctor?</a></h3>
										</div>
									

										

											<div className="form-group form-focus">
												<input type="text" className="form-control floating" onBlur={(e)=>{setDoctorUsername(e.target.value)}}/>
												<label className="focus-label">Username</label>
											</div>
											<div className="form-group form-focus">
												<input type="password" className="form-control floating" onBlur={(e)=>{setDoctorPassword(e.target.value)}}/>
												<label className="focus-label">Password</label>
											</div>
											<div className="text-right">
												<a className="forgot-link" href="forgot-password.html">Forgot Password ?</a>
											</div>
											<button className="btn btn-primary btn-block btn-lg login-btn"><Link to="/without" onClick={verifyDoctor()}>Login</Link></button>
											
											
											<div className="text-center dont-have">Don’t have an account? <a href="/doctor">Register</a></div>
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
