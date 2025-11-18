import { Routes, Route } from "react-router-dom";
import LoginPage from "./components/LoginPage";
import ProtectedRoute from "./components/ProtectedRout";
import Dashboard from "./components/Dashboard";
import CounterPage from "./components/CounterPage";
import DigitalClock from "./components/DigitalClock";
import NotFound from "./components/NotFound";
import "./Style/App.css";

function App() {
  return (
    <Routes>

      <Route path="/" element={<LoginPage />} />

      <Route
        path="/dashboard"
        element={
          <ProtectedRoute>
            <Dashboard />
          </ProtectedRoute>}>

        <Route path="counter" element={<CounterPage />} />
        <Route path="digital" element={<DigitalClock />} />
      </Route>
          
          <Route path="*" element={<NotFound />} />
    </Routes>
  );
}

export default App;
