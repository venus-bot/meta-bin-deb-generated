PACKAGES = "${PN} libgdbm-compat4 libgdbm6"
PROVIDES = "libgdbm-compat4 libgdbm6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gdbm/libgdbm-compat4_1.18.1-4_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/gdbm/libgdbm6_1.18.1-4_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libgdbm-compat4 = "libgdbm-compat4_1.18.1-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "9b08b8aca2a960139a17a8a9d861f3e34334cb75c05d35a7bfb77c3a12f733a7"
SRC_URI[deb0.md5sum] = "769f2f3b3ff9810a858e7dc42422bb1d"
DEBFILENAME_libgdbm6 = "libgdbm6_1.18.1-4_armhf.deb"
SRC_URI[deb1.sha256sum] = "6657af04e5ca4f3d0cf2339ee102583b27522ec06ce16bb9fce47108087a0cbf"
SRC_URI[deb1.md5sum] = "0dc0936e5d61c43e1d1cf6b365f7e463"

RDEPENDS_lib${PN}-compat4 = "libc6 (>= 2.7) libgdbm6 (>= 1.16)"
RDEPENDS_lib${PN}6 = "libc6 (>= 2.28)"
DEPENDS = "libc6"


inherit deb_group

FILES_libgdbm-compat4 = " \
    ./usr/lib/arm-linux-gnueabihf/libgdbm_compat.so.4 \
    ./usr/lib/arm-linux-gnueabihf/libgdbm_compat.so.4.0.0 \
    ./usr/share/doc/libgdbm-compat4/changelog.Debian.gz \
    ./usr/share/doc/libgdbm-compat4/changelog.gz \
    ./usr/share/doc/libgdbm-compat4/copyright\
"
FILES_libgdbm6 = " \
    ./usr/lib/arm-linux-gnueabihf/libgdbm.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libgdbm.so.6.0.0 \
    ./usr/share/doc/libgdbm6/changelog.Debian.gz \
    ./usr/share/doc/libgdbm6/changelog.gz \
    ./usr/share/doc/libgdbm6/copyright\
"
