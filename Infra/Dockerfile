# Etapa 1: Construcción
FROM node:22-alpine as build-stage
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
# No pasamos ARGs ni ENVs, Vite usará el "/api/v1" por defecto
RUN npm run build

# Etapa 2: Servido
FROM nginx:stable-alpine as production-stage
COPY --from=build-stage /app/dist /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
