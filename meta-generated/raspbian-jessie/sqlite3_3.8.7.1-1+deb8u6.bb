PACKAGES = "${PN} libsqlite3-0"
PROVIDES = "libsqlite3-0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/sqlite3/libsqlite3-0_3.8.7.1-1+deb8u6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsqlite3-0 = "libsqlite3-0_3.8.7.1-1+deb8u6_armhf.deb"
SRC_URI[deb0.sha256sum] = "67d14e9137a0737856e523fd41c92554497c99f14567c1b382300c7f51346895"
SRC_URI[deb0.md5sum] = "f16493c8d15bf03dcc51fa582f2c9efb"

RDEPENDS_lib${PN}-0 = "libc6 (>= 2.4) multiarch-support"
DEPENDS = "libc6 multiarch-support"


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
