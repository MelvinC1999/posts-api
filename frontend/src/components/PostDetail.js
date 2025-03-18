import React, { useEffect, useState } from "react";
import { getPostById } from "../services/postService";
import { useParams, useNavigate } from "react-router-dom";
import "./PostDetail.css";

const PostDetail = () => {
    const { id } = useParams();
    const navigate = useNavigate();
    const [post, setPost] = useState(null);

    useEffect(() => {
        loadPost();
    }, [id]);

    const loadPost = async () => {
        try {
            const response = await getPostById(id);
            setPost(response);
        } catch (error) {
            console.error("Error al obtener los detalles del post:", error);
        }
    };

    if (!post) {
        return <p>Cargando...</p>;
    }

    return (
        <div className="post-detail-container">
            <h1 className="title">Detalle del Post</h1>
            <p><strong>Texto:</strong> {post.text}</p>
            <p><strong>Autor:</strong> {post.username}</p>
            <p><strong>Fecha:</strong> {new Date(post.created_at).toLocaleString()}</p>
            <p><strong>Ubicación:</strong> {post.location || "N/A"}</p>
            <p><strong>Interacciones:</strong></p>
            <ul>
                <li>👍 Me gusta: {post.likes}</li>
                <li>💬 Comentarios: {post.comments}</li>
                <li>🔄 Compartidos: {post.shares}</li>
            </ul>
            <button onClick={() => navigate("/")} className="back-btn">Volver</button>
        </div>
    );
};

export default PostDetail;