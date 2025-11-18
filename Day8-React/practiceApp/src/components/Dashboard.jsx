import React from "react";
import { Link, Outlet, useNavigate } from "react-router-dom";

function Dashboard() {
  const navigate = useNavigate();

  const handleLogout = () => {
    localStorage.removeItem("isLoggedIn");
    navigate("/");
  };

  return (
    <div className="DashContainer">

      <div><h3>Welcome to Dashboard</h3></div>
     
      <div className="navlst">
        <nav>
        <Link to="counter">Counter Page</Link> |{" "}
        <Link to="digital">Digital Clock</Link> |{" "}
        <button onClick={handleLogout}>Logout</button>
      </nav>

      </div>
      <Outlet />
    </div>
  );
}

export default Dashboard;
