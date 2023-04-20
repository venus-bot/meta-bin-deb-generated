PACKAGES = "${PN} libsystemd0 libudev1"
PROVIDES = "libsystemd0 libudev1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/systemd/libsystemd0_241-7~deb10u9+rpi1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/s/systemd/libudev1_241-7~deb10u9+rpi1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libsystemd0 = "libsystemd0_241-7~deb10u9+rpi1_armhf.deb"
SRC_URI[deb0.sha256sum] = "0140e598fbfbca80ff4f7569d035d0b7b4301880526d1a6243d44c5f86f42afb"
SRC_URI[deb0.md5sum] = "3e1967279ca86df58733f0d14e0e3fcf"
DEBFILENAME_libudev1 = "libudev1_241-7~deb10u9+rpi1_armhf.deb"
SRC_URI[deb1.sha256sum] = "c19d357006297c97e9cbcdea1b2f0c9b5e1c77f3fad31e019df883b344f511c9"
SRC_URI[deb1.md5sum] = "d5e58ed2340daaca09918166626c9025"

RDEPENDS_lib${PN}0 = "libc6 (>= 2.28) libgcrypt20 (>= 1.8.0) liblz4-1 (>= 0.0~r122) liblzma5 (>= 5.1.1alpha+20120614)"
RDEPENDS_libudev1 = "libc6 (>= 2.28)"
DEPENDS = "libc6 libgcrypt20 liblz4-1 liblzma5"


inherit deb_group

FILES_libsystemd0 = " \
    ./lib/arm-linux-gnueabihf/libsystemd.so.0 \
    ./lib/arm-linux-gnueabihf/libsystemd.so.0.25.0 \
    ./usr/share/doc/libsystemd0/changelog.Debian.gz \
    ./usr/share/doc/libsystemd0/copyright\
"
FILES_libudev1 = " \
    ./lib/arm-linux-gnueabihf/libudev.so.1 \
    ./lib/arm-linux-gnueabihf/libudev.so.1.6.13 \
    ./usr/share/doc/libudev1/changelog.Debian.gz \
    ./usr/share/doc/libudev1/copyright\
"
