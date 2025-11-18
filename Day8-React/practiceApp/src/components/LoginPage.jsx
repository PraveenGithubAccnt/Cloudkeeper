import { useState } from "react";
import { useNavigate } from "react-router-dom";

function LoginPage() {
  const [formData, setFormData] = useState({ firstName: "", lastName: "" });
  const navigate = useNavigate();

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    if (formData.firstName.trim() !== "" && formData.lastName.trim() !== "") {
      localStorage.setItem("isLoggedIn", "true");

      localStorage.setItem("userData", JSON.stringify(formData));

      navigate("/dashboard");
    } else {
      alert("Please fill name");
    }
  };

  return (
    <div className="LoginContainer">
      <h1>Welcome to Login Page</h1>

      <form onSubmit={handleSubmit} className="form">
        <div className="formData">
          <label>First Name</label>
          <input
            name="firstName"
            placeholder="First Name"
            onChange={handleChange}
          />
        </div>

        <br />

        <div className="formData">
          <label>Last Name</label>
          <input
            name="lastName"
            placeholder="Last Name"
            onChange={handleChange}
          />
        </div>

        <br />

        <button className="loginbtn" type="submit">
          Login
        </button>
      </form>
    </div>
  );
}

export default LoginPage;
