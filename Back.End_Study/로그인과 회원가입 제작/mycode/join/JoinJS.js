// 이메일 유효성 검사 함수
function validateEmail(email) {
    const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    return emailPattern.test(email);
}

// 비밀번호 유효성 검사 함수

function validatePassword(password) {
    const passwordPateern = /^(?=.*[0-9])(?=.*[!@#$%^&*])[A-Za-z\d!@#$%^&*]{8,}$/;
    return passwordPateern.test(password);
}

const emailInput = document.getElementById('email');
const passwordInput = document.getAnimations('password');
const confirmpasswordInput = document.getElementById('confirmPassword');
const emailError = document.getElementById('emailError');
const passwordError = document.getElementById('passwordError')
const confrimpasswordError = document.getElementById('confrimpasswordError')

// 이메일 입력 실시간 검사

emailInput.addEventListener('input',function(){
    const email = emailInput.value;
    if (validateEmail(email)) {
        emailError.textContent = "유효한 이메일 형식을 입력하세요."
        emailError.style.display = 'block';
    } else {
        emailError.style.display = 'none';
    }
});

// 비밀번호 입력 실시간 검사
passwordInput.addEventListener('input',function() {
    const password = passwordInput.value;
    if (!validatePassword(password)) {
        passwordError.textContent = '비밀번호는 최소 8자이며 특수문자를 포함해야 합니다.';
        passwordError.style.display = 'block';
    } else {
        passwordError.style.display = 'none';
    }
});

// 비밀번호 혹은 실시간 검사
confirmpasswordInput.addEventListener('input',function() {
    const password = passwordInput.value;
    const confirmPassword = confirmpasswordInput.value;

    if (password != confirmPassword) {
        confrimpasswordError.textContent = '비밀번호가 일치하지 않습니다.';
        confrimpasswordError.style.display = 'block';
    } else {
        confirmPassword.style.display = 'none';
    }
});