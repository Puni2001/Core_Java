#!/bin/bash

# Change to your Core Java folder

# Stage all changes
git add .

# Commit with timestamp
git commit -m "Auto-update: $(date '+%Y-%m-%d %H:%M')"

# Push to main branch
git push origin main
