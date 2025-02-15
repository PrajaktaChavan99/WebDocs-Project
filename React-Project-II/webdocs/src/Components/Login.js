

import { useState } from 'react';
import { Link } from 'react-router-dom';
import login from '../UI/assets/img/login-banner.png';
import Navbar from './Navbar';
export default function Login(){


	const [username,setUsername] = useState('');
    const [password,setPassword] = useState('');
	const [patient,setPatient] = useState([]);

    
   



	let verify=()=>
    {
		
       
        var promise = fetch(`http://localhost:8080/patient/login/`+username+"/"+password, {
						
                       "method": "POST",
                     })
        var anotherpromise =promise.then(response => {
			// console.log(response.json())
                         return response.json()
                    })
        anotherpromise.then(jsondataarr => {
			
				setPatient(
                      jsondataarr
					  
                        );console.log("anotherpromise"+patient)})
					   

                     
        promise.catch(err => { console.log(err); 
                     });
					 
					 localStorage.setItem("patient",JSON.stringify(patient))
					 console.log(localStorage.getItem('patient'))
					 
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
											{/* <h3>Login <span>WebDocs</span></h3> */}
											<h3>Patient's Login<a href="/doctorlogin">Are you Doctor?</a></h3>
										</div>
									

										{/* <div classNameName="login-header">
											<h3>Patient's Login<a href="/doctorlogin">Are you Doctor?</a></h3>
										</div> */}
											
											<div className="form-group form-focus">
												<input type="text" className="form-control floating" onBlur={(e)=>{setUsername(e.target.value)}} />
												<label className="focus-label">Username</label>
											</div>
											<div className="form-group form-focus">
												<input type="password" className="form-control floating" onBlur={(e)=>{setPassword(e.target.value)}}/>
												<label className="focus-label">Password</label>
											</div>
											<div className="text-right">
												<a className="forgot-link" href="forgot-password.html">Forgot Password ?</a>
											</div>
											<button className="btn btn-primary btn-block btn-lg login-btn"><Link to="/patienthome" onClick={verify()}>Login</Link></button>
											
											
											<div className="text-center dont-have">Don’t have an account? <a href="/patient">Register</a></div>
											
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
