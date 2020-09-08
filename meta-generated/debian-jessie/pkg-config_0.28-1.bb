PACKAGES = "${PN} pkg-config"
PROVIDES = "pkg-config"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/pkg-config/pkg-config_0.28-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_pkg-config = "pkg-config_0.28-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "7d388c17dbfce865f56de8afe231d08e57c1810637604f6c97b47bdb9cfed090"
SRC_URI[deb0.md5sum] = "7772732e5f69f3f47e434966637cfc99"

RDEPENDS_${PN} = "libc6 (>= 2.4) libglib2.0-0 (>= 2.16.0)"

inherit deb_group

FILES_${PN} = " \
    ./usr/bin/arm-unknown-linux-gnueabihf-pkg-config \
    ./usr/bin/pkg-config \
    ./usr/share/aclocal/pkg.m4 \
    ./usr/share/doc/pkg-config/AUTHORS \
    ./usr/share/doc/pkg-config/NEWS.gz \
    ./usr/share/doc/pkg-config/README \
    ./usr/share/doc/pkg-config/changelog.Debian.gz \
    ./usr/share/doc/pkg-config/changelog.gz \
    ./usr/share/doc/pkg-config/copyright \
    ./usr/share/doc/pkg-config/pkg-config-guide.html \
    ./usr/share/man/man1/pkg-config.1.gz \
    ./usr/share/pkg-config-crosswrapper\
"
