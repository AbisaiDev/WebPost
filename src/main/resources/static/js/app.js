addEventListener('DOMContentLoaded', () => {
    const contentMenu = document.querySelector('.ui-button')

    contentMenu.addEventListener('click', () => {
        const item = document.querySelector('.list')
        item.classList.toggle('show-list');
    })
})