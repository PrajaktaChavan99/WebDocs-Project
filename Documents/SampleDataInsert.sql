

INSERT INTO Patient VALUES(
1,
"Rushikesh",
LOAD_FILE('D:/Project-Work/Images/patient1.jpg'),
"1999-02-01",
"Male",
"8521558860",
"rushikesh123@gmail.com",
"rushikesh",
"rushi#123"
);

INSERT INTO Patient VALUES(
2,
"Ashutosh",
LOAD_FILE('D:/Project-Work/Images/patient2.jpg'),
"2009-03-02",
"Male",
"9650125524",
"ashutosh456@gmail.com",
"ashutosh",
"ashu#456"
);

INSERT INTO Patient VALUES(
3,
"Divya",
LOAD_FILE('D:/Project-Work/Images/patient3.jpg'),
"1989-05-06",
"Female",
"9922534820",
"divya@gmail.com",
"divya",
"divya*987"
);

INSERT INTO Category VALUES(
1,
"Allergists/Immunologists",
"An immunologist treats health issues brought on by immune system problems & doctor who diagnose, treat, and work to prevent immune system disorders."
);

INSERT INTO Category VALUES(
2,
"Anesthesiologists",
"An anesthesiologist is a highly skilled medical doctor who specializes in pain relief and cares for patients before, during, and after surgery."
);

INSERT INTO Category VALUES(
3,
"Cardiologists",
"Cardiologists are doctors specialized in diagnosing, treating and preventing diseases that mainly affect the heart and blood vessels."
);

INSERT INTO Category VALUES(
4,	
"Colon and Rectal Surgeons",	
"A colon and rectal surgeon is trained to diagnose and treat various diseases of the intestinal tract, colon, rectum, anal canal, and perianal area by medical and surgical means."
);

INSERT INTO Category VALUES(
5,
"Dermatologists",
"A dermatologist is a specialist medical doctor who manages diseases related to skin, hair, nails, and some cosmetic problems."
);

INSERT INTO Hospital VALUES(
1,
"Saraswati Hospital",	
"M.G Road, Pune	",
LOAD_FILE('D:/Project-Work/Images/image1.jpg')
);

INSERT INTO Hospital VALUES(
2,
"JJ Hospital",
"ABC Complex,Karnik Nagar,Kolhapur",
LOAD_FILE('D:/Project-Work/Images/image2.jpg')
);

INSERT INTO Hospital VALUES(
3,
"Birla Hospital",
"XYZ,Shivaji chowk, Solapur",
LOAD_FILE('D:/Project-Work/Images/image3.jpg')
);

INSERT INTO Doctor VALUES(
1,
"Prajakta",
LOAD_FILE('D:/Project-Work/Images/doctor1.jpg'),
"1981-02-09",
"Female",
"9002199907",
"praju@gmail.com",
"A123456",
3,
3,
15,
500,
"prajakta",
"praju&123"
);

INSERT INTO Doctor VALUES(
2,
"Dnyaneshwar",
LOAD_FILE('D:/Project-Work/Images/doctor2.jpg'),
"1987-08-12",
"Male",
"8898512520",
"dnyanesh@gmail.com",
"B456789",
1,
1,
10,
250,
"dnyaneshwar",
"dnyanu#456"
);

INSERT INTO Doctor VALUES(
3,
"Vaibhav",
LOAD_FILE('D:/Project-Work/Images/doctor3.jpg'),
"1988-07-23",
"Male",
"9865321245",
"vaibhav789@gmail.com",
"C987654",
5,	
2,	
9,	
300	,
"vaibhav",
"vaibhav#789"
);

INSERT INTO Slot VALUES(
1,
1,
3,
"2022-02-02",
'09:00',
'09:30'
);

INSERT INTO Slot VALUES(
2,	
1,	
3,	
"2022-04-02",	
'09:30',
'10:00'
);

INSERT INTO Slot VALUES(
3,	
3,	
2,	
"2022-02-02",
'09:00',
'09:30'
);

INSERT INTO Slot VALUES(
4,
2,
1,
"2022-02-09",
'09:00',
'09:30'
);

INSERT INTO Appointment VALUES(
1,
2,
1,
1,
TRUE
);

INSERT INTO Appointment VALUES(
2,
3,	
3,	
2,	
TRUE
);

INSERT INTO Appointment VALUES(
3,	
1,	
1,	
3,	
FALSE
);

INSERT INTO Feedback VALUES(
1,	
3,	
1,	
"Very Good",
5
);

INSERT INTO Feedback VALUES(
2,	
1,	
2,	
"Nice Hospitality",	
4
);

INSERT INTO Feedback VALUES(
3,	
2,	
3,	
"Cared very well",
3
);

