import axios from "axios";

const API_URL = "http://localhost:8080/api/posts";

export const getAllPosts = async () => {
    try {
        const response = await axios.get(API_URL);
        return response.data;
    } catch (error) {
        console.error("Error al obtener los posts:", error);
        return [];
    }
};

export const getPostById = async (id) => {
    try {
        const response = await axios.get(`${API_URL}/${id}`);
        return response.data;
    } catch (error) {
        console.error(`Error al obtener el post con ID ${id}:`, error);
        return null;
    }
};
