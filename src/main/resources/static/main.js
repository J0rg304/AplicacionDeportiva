import { useEffect, useRef } from 'react';
import { motion, useInView } from 'framer-motion';

const sections = [
    { title: 'Baloncesto', color: '#FFD700' },
    { title: 'Fútbol', color: '#90EE90' },
    { title: 'Tenis', color: '#ADD8E6' },
    { title: 'NFL', color: '#FF6347' },
];

function Section({ title, color }) {
    const ref = useRef(null);
    const isInView = useInView(ref, { once: false, margin: '-50% 0px -50% 0px' });

    return (
        <motion.div
            ref={ref}
            initial={{ opacity: 0, y: 100 }}
            animate={{ opacity: isInView ? 1 : 0, y: isInView ? 0 : 100 }}
            transition={{ duration: 0.6 }}
            className="min-h-screen flex flex-col justify-center items-center text-center"
            style={{ backgroundColor: color }}
        >
            <h1 className="text-5xl font-bold text-white mb-4 drop-shadow-lg">{title}</h1>
            <p className="text-lg text-white max-w-xl">
                Disfruta de las últimas noticias, partidos y estadísticas sobre {title}.
            </p>
        </motion.div>
    );
}

export default function Home() {
    return (
        <div className="w-full overflow-y-auto">
            {sections.map((section) => (
                <Section key={section.title} title={section.title} color={section.color} />
            ))}
        </div>
    );
}