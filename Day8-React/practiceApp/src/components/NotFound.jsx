import React from "react";
import NotFoundImg from "../assets/notfound.jpg";

function NotFound() {
  return (
    <div style={{ textAlign: "center", padding: "40px" }}>
      <h3
        style={{
          fontFamily: "'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif",
          color: "#3498db",
          marginBottom: "20px",
          fontSize: "24px",
        }}
      >
        Ooops..
      </h3>

      <img
        src={NotFoundImg}
        alt="404 Not Found"
        style={{ width: "350px", marginBottom: "20px" }}
      />
    </div>
  );
}

export default NotFound;
