import { rectangle } from "./shapes/rectangle.js";
import { circle } from "./shapes/circle.js";
import { square } from "./shapes/square.js";
import { newRenderer } from "./renderer.js";

const rect = rectangle(2, 3); // Rectangle shape
const circleShape = circle(5); // Circle shape
const squareShape = square(4); // Square shape

const rectRenderer = newRenderer(rect);
rectRenderer.draw();

const circleRenderer = newRenderer(circleShape);
circleRenderer.draw();

const squareRenderer = newRenderer(squareShape);
squareRenderer.draw();