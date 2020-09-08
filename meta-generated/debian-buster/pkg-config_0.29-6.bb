PACKAGES = "${PN} pkg-config"
PROVIDES = "pkg-config"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/pkg-config/pkg-config_0.29-6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_pkg-config = "pkg-config_0.29-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "b390b6a3085510a6de8984d861d71133715b7462c02609eb7eda169afa6b2eb2"
SRC_URI[deb0.md5sum] = "04101c26ebdb5495a250bfd6ad960806"

RDEPENDS_${PN} = "libc6 (>= 2.4) libdpkg-perl libglib2.0-0 (>= 2.16.0)"

inherit deb_group

FILES_${PN} = " \
    ./etc/dpkg/dpkg.cfg.d/pkg-config-hook-config \
    ./usr/bin/arm-unknown-linux-gnueabihf-pkg-config \
    ./usr/bin/pkg-config \
    ./usr/lib/pkg-config.multiarch \
    ./usr/share/aclocal/pkg.m4 \
    ./usr/share/doc/pkg-config/AUTHORS \
    ./usr/share/doc/pkg-config/NEWS.gz \
    ./usr/share/doc/pkg-config/README \
    ./usr/share/doc/pkg-config/changelog.Debian.gz \
    ./usr/share/doc/pkg-config/changelog.gz \
    ./usr/share/doc/pkg-config/copyright \
    ./usr/share/doc/pkg-config/pkg-config-guide.html \
    ./usr/share/man/man1/pkg-config.1.gz \
    ./usr/share/pkg-config-crosswrapper \
    ./usr/share/pkg-config-dpkghook\
"
