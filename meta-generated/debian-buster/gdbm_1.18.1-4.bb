PACKAGES = "${PN} libgdbm-compat4 libgdbm6"
PROVIDES = "libgdbm-compat4 libgdbm6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/gdbm/libgdbm-compat4_1.18.1-4_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/g/gdbm/libgdbm6_1.18.1-4_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libgdbm-compat4 = "libgdbm-compat4_1.18.1-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "dac9aaa2eb8697008e2b22e5738872b975ae73e6fc936da0d0db3c6f5e3a7346"
SRC_URI[deb0.md5sum] = "73f902ee609fe1cad60234da4c2d64aa"
DEBFILENAME_libgdbm6 = "libgdbm6_1.18.1-4_armhf.deb"
SRC_URI[deb1.sha256sum] = "da2fd9dbeab182c26e1babc1c002d30d422ac308778e2ae7914e5685e7f41b43"
SRC_URI[deb1.md5sum] = "920dd5b1460229dbc3408fb1cec5706f"

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
