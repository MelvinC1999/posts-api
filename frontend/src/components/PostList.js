import React, { useEffect, useState } from "react";
import { getAllPosts } from "../services/postService";
import { useNavigate } from "react-router-dom";
import "./PostList.css";

const PostList = () => {
    const [posts, setPosts] = useState([]);
    const [searchTerm, setSearchTerm] = useState("");
    const navigate = useNavigate();

    useEffect(() => {
        loadPosts();
    }, []);

    const loadPosts = async () => {
        try {
            const response = await getAllPosts();
            setPosts(response || []);
        } catch (error) {
            console.error("Error al obtener los posts:", error);
            setPosts([]);
        }
    };

    const handleSearch = (event) => {
        setSearchTerm(event.target.value.toLowerCase());
    };

    // Filtrado de publicaciones por texto en tiempo real
    const filteredPosts = posts.filter(post =>
        post.text.toLowerCase().includes(searchTerm)
    );

    return (
        <div className="container">
            <h1 className="title">Frontend en React - Posts desde Spring Boot</h1>
            <h2 className="subtitle">📢 Lista de Posts</h2>

            {/* Barra de Búsqueda */}
            <input
                type="text"
                className="search-bar"
                placeholder="Buscar publicaciones..."
                value={searchTerm}
                onChange={handleSearch}
            />

            <div className="table-container">
                <table className="post-table">
                    <thead>
                    <tr>
                        <th>Texto</th>
                        <th>Fecha</th>
                        <th>Autor</th>
                        <th>Interacciones</th>
                    </tr>
                    </thead>
                    <tbody>
                    {filteredPosts.length > 0 ? (
                        filteredPosts.map((post) => (
                            <tr key={post.id} onClick={() => navigate(`/post/${post.id}`)}>
                                <td>{post.text}</td>
                                <td>{new Date(post.created_at).toLocaleDateString()}</td>
                                <td>{post.username}</td>
                                <td>{post.likes + post.comments + post.shares}</td>
                            </tr>
                        ))
                    ) : (
                        <tr>
                            <td colSpan="4" className="no-posts">No hay posts disponibles</td>
                        </tr>
                    )}
                    </tbody>
                </table>
            </div>
        </div>
    );
};

export default PostList;