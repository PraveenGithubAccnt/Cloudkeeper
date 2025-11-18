import React, { useEffect, useState } from "react";

function DigitalClock() {
  const [time, setTime] = useState(new Date());

  useEffect(() => {
    const timer = setInterval(() => {
      setTime(new Date());
    }, 1000);

    return () => clearInterval(timer); 
  }, []);

  const formattedTime = time.toLocaleTimeString();

  return (
    <div className="DigitalClock">
      <h2>Digital Clock</h2>
        <div className="clock" style={{ fontSize: "40px", fontWeight: "bold", textAlign: "center" }}>
      {formattedTime}
    </div>
    </div>
    
  );
}

export default DigitalClock;
