"use client";

import { motion } from "motion/react";
import { useState, useRef, useEffect } from "react";

import { cn } from "@/lib/utils";

const tabs = [
  {
    id: 0,
    label: "Homes",
    video_url:
      "https://cdn.21st.dev/assets/mirror/28/286525aad7b63f89a8ee3a905d8ca642637334845d9864ba0b9981187b252605.webm",
    initial_render_url:
      "https://cdn.21st.dev/assets/mirror/b3/b37e8c1b9dde4a501a96c6bee15fc7ccbc390826f998998a46d95b208c4e2bd9.webm",
  },
  {
    id: 1,
    label: "Experiences",
    video_url:
      "https://cdn.21st.dev/assets/mirror/ef/ef88a85845e2650bc471b470eff119ed04235323b9375929d0df0846dc951dc1.webm",
    initial_render_url:
      "https://cdn.21st.dev/assets/mirror/60/605831be6c59954dbcb62d30a627acc94c9982668bd277dbdcfb2945eac2b389.webm",
  },
  {
    id: 2,
    label: "Services",
    video_url:
      "https://cdn.21st.dev/assets/mirror/0f/0f6338ddf758cf9e9398d1cf0f346a52b3df5ae30880c8b54c85dd7a2e97dcb4.webm",
    initial_render_url:
      "https://cdn.21st.dev/assets/mirror/56/56c549f29cbc45904e4109a00749542494d257e7c2d65688ef9422ce1d1060be.webm",
  },
];

function NewBadge({ className }: { className?: string }) {
  return (
    <div
      className={cn(
        "bg-primary px-2 py-1 rounded-t-full rounded-br-full rounded-bl-sm text-xs font-bold text-primary-foreground transition-all duration-200 relative overflow-hidden before:content-[''] before:absolute before:inset-0 before:rounded-[inherit] before:pointer-events-none before:z-[1] before:shadow-[inset_0_0_0_1px_rgba(170,202,255,0.2),inset_0_0_10px_0_rgba(170,202,255,0.3),inset_0_3px_7px_0_rgba(170,202,255,0.4),inset_0_-4px_3px_0_rgba(170,202,255,0.4),0_1px_3px_0_rgba(0,0,0,0.50),0_4px_12px_0_rgba(0,0,0,0.65)] backdrop-blur-md",
        className
      )}
    >
      <span>NEW</span>
      <span
        className="absolute left-1/2 -translate-x-1/2 opacity-40 z-50 scale-y-[-1] translate-y-2.5"
        style={{
          maskImage: "linear-gradient(to top, white 20%, transparent 50%)",
          WebkitMaskImage:
            "linear-gradient(to top, white 10%, transparent 50%)",
        }}
      >
        NEW
      </span>
    </div>
  );
}

export function ThreeDIconTabs({ className }: { className?: string }) {
  const [activeTab, setActiveTab] = useState(0);
  const videoRefs = useRef<HTMLVideoElement[]>([]);

  useEffect(() => {
    videoRefs.current = videoRefs.current.slice(0, tabs.length);
  }, []);
  const [tabClicked, setTabClicked] = useState(false);
  const handleTabClick = (newTabId: number) => {
    setTabClicked(true);
    if (newTabId !== activeTab) {
      setActiveTab(newTabId);
      videoRefs.current.forEach((video) => {
        if (video) {
          video.pause();
          video.currentTime = 0;
        }
      });

      const videoElement = videoRefs.current[newTabId];
      if (videoElement) {
        videoElement.currentTime = 0;
        videoElement.play();
      }
    }
  };

  return (
    <div className="flex flex-col items-center w-full">
      <div className={cn("flex space-x-8 rounded-full", className)}>
        {tabs.map((tab) => (
          <motion.button
            key={tab.id}
            whileTap={"tapped"}
            whileHover={"hovered"}
            onClick={() => handleTabClick(tab.id)}
            className={cn(
              "relative px-2 tracking-[0.01em] cursor-pointer text-neutral-600 dark:text-neutral-300 transition focus-visible:outline-1 focus-visible:ring-1 focus-visible:outline-none flex gap-2 items-center",
              activeTab === tab.id
                ? "text-black dark:text-white font-medium tracking-normal"
                : "hover:text-neutral-800 dark:hover:text-neutral-200 text-neutral-500 dark:text-neutral-400"
            )}
            style={{ WebkitTapHighlightColor: "transparent" }}
          >
            {activeTab === tab.id && (
              <motion.span
                layoutId="bubble"
                className="absolute bottom-0 w-full left-0 right-0 h-[2px] bg-neutral-800 dark:bg-neutral-100"
                transition={{ type: "spring", bounce: 0.2, duration: 0.6 }}
              />
            )}
            <div className="relative w-7 h-7 flex items-center justify-center">
              <video
                ref={(el) => {
                  if (el) videoRefs.current[tab.id] = el;
                }}
                src={tab.video_url}
                poster={tab.initial_render_url}
                muted
                playsInline
                className="w-full h-full object-contain pointer-events-none"
              />
            </div>
            <span className="text-sm">{tab.label}</span>
            {tab.id === 2 && <NewBadge />}
          </motion.button>
        ))}
      </div>
    </div>
  );
}

export default ThreeDIconTabs;
