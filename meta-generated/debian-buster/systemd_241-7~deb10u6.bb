PACKAGES = "${PN} libsystemd0 libudev1"
PROVIDES = "libsystemd0 libudev1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/systemd/libsystemd0_241-7~deb10u6_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/s/systemd/libudev1_241-7~deb10u6_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libsystemd0 = "libsystemd0_241-7~deb10u6_armhf.deb"
SRC_URI[deb0.sha256sum] = "d8e883951706ce9340e27aab5e49040f495b854f53069ea56a829f294f1597b0"
SRC_URI[deb0.md5sum] = "25ca359e507cf9142a7ae5a3bdd30f67"
DEBFILENAME_libudev1 = "libudev1_241-7~deb10u6_armhf.deb"
SRC_URI[deb1.sha256sum] = "52e03f866226f59d1d94ed643c146306a7fd2e7343607bb49602a3aacf1e88ad"
SRC_URI[deb1.md5sum] = "c18b9a679fc018dfe5553a263242c424"

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
