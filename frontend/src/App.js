import './App.css';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import React from "react";
import PostList from "./components/PostList";
import PostDetail from "./components/PostDetail";

function App() {
  return (
      <Router>
          <Routes>
              <Route path="/" element={<PostList />} />
              <Route path="/post/:id" element={<PostDetail />} />
          </Routes>
      </Router>
  );
}

export default App;
