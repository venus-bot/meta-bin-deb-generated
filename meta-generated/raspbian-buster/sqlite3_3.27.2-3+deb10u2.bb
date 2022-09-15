PACKAGES = "${PN} libsqlite3-0"
PROVIDES = "libsqlite3-0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/sqlite3/libsqlite3-0_3.27.2-3+deb10u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsqlite3-0 = "libsqlite3-0_3.27.2-3+deb10u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "014a935145f62ceba66028ca7439743d361ec5c22dd6b785214fea5c1b6ae7b1"
SRC_URI[deb0.md5sum] = "4375c1ae89851c157cce4022b2dccee6"

RDEPENDS_lib${PN}-0 = "libc6 (>= 2.28)"
DEPENDS = "libc6"


inherit deb_group

FILES_libsqlite3-0 = " \
    ./usr/lib/arm-linux-gnueabihf/libsqlite3.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libsqlite3.so.0.8.6 \
    ./usr/share/doc/libsqlite3-0/README.Debian \
    ./usr/share/doc/libsqlite3-0/changelog.Debian.gz \
    ./usr/share/doc/libsqlite3-0/changelog.gz \
    ./usr/share/doc/libsqlite3-0/changelog.html.gz \
    ./usr/share/doc/libsqlite3-0/copyright\
"
