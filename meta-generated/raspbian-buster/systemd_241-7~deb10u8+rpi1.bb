PACKAGES = "${PN} libsystemd0 libudev1"
PROVIDES = "libsystemd0 libudev1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/systemd/libsystemd0_241-7~deb10u8+rpi1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/s/systemd/libudev1_241-7~deb10u8+rpi1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libsystemd0 = "libsystemd0_241-7~deb10u8+rpi1_armhf.deb"
SRC_URI[deb0.sha256sum] = "9264da4c80a26d2bb5040177cf5402f5d22cec71fe5d947960890d582746e724"
SRC_URI[deb0.md5sum] = "74c8a7f7af8d1d99393e92b78191d62d"
DEBFILENAME_libudev1 = "libudev1_241-7~deb10u8+rpi1_armhf.deb"
SRC_URI[deb1.sha256sum] = "bc79643cd21856fb7132bbc78a52f80d1bef5c87a5dc0f9d4128563690843c9a"
SRC_URI[deb1.md5sum] = "daa26821a542fda6ee192e39a7d5375d"

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
