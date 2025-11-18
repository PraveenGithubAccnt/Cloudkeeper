import React, { useEffect, useState } from "react";

function CounterPage() {
  const [count, setCount] = useState(0);
 // const[second,setSecond]=useState(0);

  const cnt = () => {
    setCount(count + 1);
  };

  const decCnt = () => {
    if (count > 0) setCount(count - 1);
  };

  useEffect(() => {
    console.log("Count is Triggerd");
  },[count]);

  //  useEffect(() => {
  // const intervel=setInterval(()=>{
  //   setSecond(second=>second+1)
  // },1000);
  // return()=>{
  //   clearInterval(intervel);
  // }
  // },[]);

  return (
    <div className="CounterContainer">
      <h1>Welcome to Counter Page</h1>
      <h3>Number of time Button Clicked: {count}</h3>
      <div className="btnDv">
        {/* <p>second {second}</p> */}
        <br></br>
        <button onClick={cnt}>Increase Me</button>
        <button onClick={decCnt}>Decrease Me</button>
      </div>
    </div>
  );
}

export default CounterPage;
