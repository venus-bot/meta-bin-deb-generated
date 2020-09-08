PACKAGES = "${PN} perl-base"
PROVIDES = "perl-base"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/perl/perl-base_5.20.2-3+deb8u11_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_perl-base = "perl-base_5.20.2-3+deb8u11_armhf.deb"
SRC_URI[deb0.sha256sum] = "ff3807bea1685e15eaedc339be113da84b2b9d96cfc7aba8c2ec5d8fb4b7698e"
SRC_URI[deb0.md5sum] = "4b59d4a4a02ab18f70402c97189c0caa"

RDEPENDS_${PN}-base = "dpkg (>= 1.17.17) libc6 (>= 2.11)"
DEPENDS = "dpkg libc6"


inherit deb_group

FILES_perl-base = " \
    ./usr/bin/perl \
    ./usr/bin/perl5.20.2 \
    ./usr/lib/arm-linux-gnueabihf/libperl.so.5.20 \
    ./usr/lib/arm-linux-gnueabihf/libperl.so.5.20.2 \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20 \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/Config.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/Config_git.pl \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/Config_heavy.pl \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/Cwd.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/DynaLoader.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/Errno.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/Fcntl.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/File/Glob.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/File/Spec.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/File/Spec/Unix.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/Hash/Util.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/IO.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/IO/File.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/IO/Handle.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/IO/Pipe.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/IO/Seekable.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/IO/Select.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/IO/Socket.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/IO/Socket/INET.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/IO/Socket/UNIX.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/List/Util.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/POSIX.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/Scalar/Util.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/Socket.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/attributes.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/auto/Cwd/Cwd.so \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/auto/Fcntl/Fcntl.so \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/auto/File/Glob/Glob.so \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/auto/Hash/Util/Util.so \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/auto/IO/IO.so \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/auto/List/Util/Util.so \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/auto/POSIX/POSIX.so \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/auto/Socket/Socket.so \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/auto/attributes/attributes.so \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/auto/re/re.so \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/lib.pm \
    ./usr/lib/arm-linux-gnueabihf/perl/5.20.2/re.pm \
    ./usr/share/doc/perl-base \
    ./usr/share/doc/perl/AUTHORS.gz \
    ./usr/share/doc/perl/Documentation \
    ./usr/share/doc/perl/README.Debian \
    ./usr/share/doc/perl/changelog.Debian.gz \
    ./usr/share/doc/perl/copyright \
    ./usr/share/lintian/overrides/perl-base \
    ./usr/share/man/man1/perl.1.gz \
    ./usr/share/man/man1/perl5.20.2.1.gz \
    ./usr/share/perl/5.20 \
    ./usr/share/perl/5.20.2/AutoLoader.pm \
    ./usr/share/perl/5.20.2/Carp.pm \
    ./usr/share/perl/5.20.2/Carp/Heavy.pm \
    ./usr/share/perl/5.20.2/Exporter.pm \
    ./usr/share/perl/5.20.2/Exporter/Heavy.pm \
    ./usr/share/perl/5.20.2/File/Basename.pm \
    ./usr/share/perl/5.20.2/File/Path.pm \
    ./usr/share/perl/5.20.2/File/Temp.pm \
    ./usr/share/perl/5.20.2/FileHandle.pm \
    ./usr/share/perl/5.20.2/Getopt/Long.pm \
    ./usr/share/perl/5.20.2/IO/Socket/IP.pm \
    ./usr/share/perl/5.20.2/IPC/Open2.pm \
    ./usr/share/perl/5.20.2/IPC/Open3.pm \
    ./usr/share/perl/5.20.2/SelectSaver.pm \
    ./usr/share/perl/5.20.2/Symbol.pm \
    ./usr/share/perl/5.20.2/Text/ParseWords.pm \
    ./usr/share/perl/5.20.2/Text/Tabs.pm \
    ./usr/share/perl/5.20.2/Text/Wrap.pm \
    ./usr/share/perl/5.20.2/Tie/Hash.pm \
    ./usr/share/perl/5.20.2/XSLoader.pm \
    ./usr/share/perl/5.20.2/base.pm \
    ./usr/share/perl/5.20.2/bytes.pm \
    ./usr/share/perl/5.20.2/bytes_heavy.pl \
    ./usr/share/perl/5.20.2/constant.pm \
    ./usr/share/perl/5.20.2/feature.pm \
    ./usr/share/perl/5.20.2/fields.pm \
    ./usr/share/perl/5.20.2/integer.pm \
    ./usr/share/perl/5.20.2/locale.pm \
    ./usr/share/perl/5.20.2/overload.pm \
    ./usr/share/perl/5.20.2/overloading.pm \
    ./usr/share/perl/5.20.2/parent.pm \
    ./usr/share/perl/5.20.2/strict.pm \
    ./usr/share/perl/5.20.2/unicore/Heavy.pl \
    ./usr/share/perl/5.20.2/unicore/To/Age.pl \
    ./usr/share/perl/5.20.2/unicore/To/Bc.pl \
    ./usr/share/perl/5.20.2/unicore/To/Bmg.pl \
    ./usr/share/perl/5.20.2/unicore/To/Bpb.pl \
    ./usr/share/perl/5.20.2/unicore/To/Bpt.pl \
    ./usr/share/perl/5.20.2/unicore/To/Cf.pl \
    ./usr/share/perl/5.20.2/unicore/To/Digit.pl \
    ./usr/share/perl/5.20.2/unicore/To/Ea.pl \
    ./usr/share/perl/5.20.2/unicore/To/Fold.pl \
    ./usr/share/perl/5.20.2/unicore/To/GCB.pl \
    ./usr/share/perl/5.20.2/unicore/To/Gc.pl \
    ./usr/share/perl/5.20.2/unicore/To/Hst.pl \
    ./usr/share/perl/5.20.2/unicore/To/Isc.pl \
    ./usr/share/perl/5.20.2/unicore/To/Jg.pl \
    ./usr/share/perl/5.20.2/unicore/To/Jt.pl \
    ./usr/share/perl/5.20.2/unicore/To/Lb.pl \
    ./usr/share/perl/5.20.2/unicore/To/Lc.pl \
    ./usr/share/perl/5.20.2/unicore/To/Lower.pl \
    ./usr/share/perl/5.20.2/unicore/To/NFCQC.pl \
    ./usr/share/perl/5.20.2/unicore/To/NFDQC.pl \
    ./usr/share/perl/5.20.2/unicore/To/NFKCCF.pl \
    ./usr/share/perl/5.20.2/unicore/To/NFKCQC.pl \
    ./usr/share/perl/5.20.2/unicore/To/NFKDQC.pl \
    ./usr/share/perl/5.20.2/unicore/To/Na1.pl \
    ./usr/share/perl/5.20.2/unicore/To/NameAlia.pl \
    ./usr/share/perl/5.20.2/unicore/To/Nt.pl \
    ./usr/share/perl/5.20.2/unicore/To/Nv.pl \
    ./usr/share/perl/5.20.2/unicore/To/PerlDeci.pl \
    ./usr/share/perl/5.20.2/unicore/To/SB.pl \
    ./usr/share/perl/5.20.2/unicore/To/Sc.pl \
    ./usr/share/perl/5.20.2/unicore/To/Scx.pl \
    ./usr/share/perl/5.20.2/unicore/To/Tc.pl \
    ./usr/share/perl/5.20.2/unicore/To/Title.pl \
    ./usr/share/perl/5.20.2/unicore/To/Uc.pl \
    ./usr/share/perl/5.20.2/unicore/To/Upper.pl \
    ./usr/share/perl/5.20.2/unicore/To/WB.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Age/NA.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Age/V11.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Age/V20.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Age/V30.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Age/V31.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Age/V32.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Age/V40.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Age/V41.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Age/V50.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Age/V51.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Age/V52.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Age/V60.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Age/V61.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Alpha/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Bc/AL.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Bc/AN.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Bc/B.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Bc/BN.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Bc/CS.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Bc/EN.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Bc/ES.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Bc/ET.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Bc/L.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Bc/NSM.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Bc/ON.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Bc/R.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Bc/WS.pl \
    ./usr/share/perl/5.20.2/unicore/lib/BidiC/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/BidiM/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Blk/NB.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Bpt/C.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Bpt/N.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Bpt/O.pl \
    ./usr/share/perl/5.20.2/unicore/lib/CE/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/CI/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/CWCF/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/CWCM/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/CWKCF/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/CWL/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/CWT/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/CWU/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Cased/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ccc/A.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ccc/AR.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ccc/ATAR.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ccc/B.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ccc/BR.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ccc/DB.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ccc/NK.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ccc/NR.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ccc/OV.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ccc/VR.pl \
    ./usr/share/perl/5.20.2/unicore/lib/CompEx/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/DI/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dash/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dep/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dia/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dt/Com.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dt/Enc.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dt/Fin.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dt/Font.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dt/Init.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dt/Iso.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dt/Med.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dt/Nar.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dt/Nb.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dt/NonCanon.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dt/Sqr.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dt/Sub.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dt/Sup.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Dt/Vert.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ea/A.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ea/H.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ea/N.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ea/Na.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ea/W.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ext/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/GCB/CN.pl \
    ./usr/share/perl/5.20.2/unicore/lib/GCB/EX.pl \
    ./usr/share/perl/5.20.2/unicore/lib/GCB/LV.pl \
    ./usr/share/perl/5.20.2/unicore/lib/GCB/LVT.pl \
    ./usr/share/perl/5.20.2/unicore/lib/GCB/SM.pl \
    ./usr/share/perl/5.20.2/unicore/lib/GCB/XX.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/C.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Cf.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Cn.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/L.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/LC.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Ll.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Lm.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Lo.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Lt.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Lu.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/M.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Mc.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Me.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Mn.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/N.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Nd.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Nl.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/No.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/P.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Pd.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Pe.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Pf.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Pi.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Po.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Ps.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/S.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Sc.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Sk.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Sm.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/So.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Z.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Gc/Zs.pl \
    ./usr/share/perl/5.20.2/unicore/lib/GrBase/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Hex/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Hst/NA.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Hyphen/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/IDC/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/IDS/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Ideo/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/In/2_0.pl \
    ./usr/share/perl/5.20.2/unicore/lib/In/2_1.pl \
    ./usr/share/perl/5.20.2/unicore/lib/In/3_0.pl \
    ./usr/share/perl/5.20.2/unicore/lib/In/3_1.pl \
    ./usr/share/perl/5.20.2/unicore/lib/In/3_2.pl \
    ./usr/share/perl/5.20.2/unicore/lib/In/4_0.pl \
    ./usr/share/perl/5.20.2/unicore/lib/In/4_1.pl \
    ./usr/share/perl/5.20.2/unicore/lib/In/5_0.pl \
    ./usr/share/perl/5.20.2/unicore/lib/In/5_1.pl \
    ./usr/share/perl/5.20.2/unicore/lib/In/5_2.pl \
    ./usr/share/perl/5.20.2/unicore/lib/In/6_0.pl \
    ./usr/share/perl/5.20.2/unicore/lib/In/6_1.pl \
    ./usr/share/perl/5.20.2/unicore/lib/In/6_2.pl \
    ./usr/share/perl/5.20.2/unicore/lib/In/6_3.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jg/Ain.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jg/Alef.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jg/Beh.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jg/Dal.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jg/FarsiYeh.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jg/Feh.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jg/Gaf.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jg/Hah.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jg/Lam.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jg/NoJoinin.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jg/Qaf.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jg/Reh.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jg/Seen.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jg/Waw.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jg/Yeh.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jt/C.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jt/D.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jt/R.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jt/T.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Jt/U.pl \
    ./usr/share/perl/5.20.2/unicore/lib/LOE/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/AI.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/AL.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/BA.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/BB.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/CJ.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/CL.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/CM.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/EX.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/GL.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/ID.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/IS.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/NS.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/OP.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/PO.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/PR.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/QU.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/SA.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lb/XX.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Lower/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Math/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/NChar/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/NFCQC/M.pl \
    ./usr/share/perl/5.20.2/unicore/lib/NFCQC/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/NFDQC/N.pl \
    ./usr/share/perl/5.20.2/unicore/lib/NFDQC/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/NFKCQC/N.pl \
    ./usr/share/perl/5.20.2/unicore/lib/NFKCQC/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/NFKDQC/N.pl \
    ./usr/share/perl/5.20.2/unicore/lib/NFKDQC/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nt/Di.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nt/None.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nt/Nu.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/0.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/1.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/10.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/100.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/1000.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/10000.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/11.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/12.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/13.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/14.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/15.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/16.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/17.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/18.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/19.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/1_2.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/1_3.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/1_4.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/1_8.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/2.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/20.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/2_3.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/3.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/30.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/3_4.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/4.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/40.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/5.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/50.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/500.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/5000.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/50000.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/6.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/60.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/7.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/70.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/8.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/80.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/9.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Nv/90.pl \
    ./usr/share/perl/5.20.2/unicore/lib/PatSyn/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/PatWS/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/Alnum.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/Assigned.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/Blank.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/Graph.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/PerlWord.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/PosixPun.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/Print.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/Word.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/XPosixPu.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/_PerlAny.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/_PerlCh2.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/_PerlCha.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/_PerlFol.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/_PerlIDC.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/_PerlIDS.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/_PerlPr2.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/_PerlPro.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/_PerlQuo.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/_XExtend.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/_XRegula.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Perl/_XSpecia.pl \
    ./usr/share/perl/5.20.2/unicore/lib/QMark/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/SB/AT.pl \
    ./usr/share/perl/5.20.2/unicore/lib/SB/CL.pl \
    ./usr/share/perl/5.20.2/unicore/lib/SB/EX.pl \
    ./usr/share/perl/5.20.2/unicore/lib/SB/FO.pl \
    ./usr/share/perl/5.20.2/unicore/lib/SB/LE.pl \
    ./usr/share/perl/5.20.2/unicore/lib/SB/LO.pl \
    ./usr/share/perl/5.20.2/unicore/lib/SB/NU.pl \
    ./usr/share/perl/5.20.2/unicore/lib/SB/SC.pl \
    ./usr/share/perl/5.20.2/unicore/lib/SB/ST.pl \
    ./usr/share/perl/5.20.2/unicore/lib/SB/Sp.pl \
    ./usr/share/perl/5.20.2/unicore/lib/SB/UP.pl \
    ./usr/share/perl/5.20.2/unicore/lib/SB/XX.pl \
    ./usr/share/perl/5.20.2/unicore/lib/SD/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/STerm/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Arab.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Armn.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Beng.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Cham.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Cprt.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Cyrl.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Deva.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Ethi.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Geor.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Grek.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Gujr.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Guru.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Han.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Hang.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Hebr.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Hira.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Kana.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Khar.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Khmr.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Knda.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Lana.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Lao.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Latn.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Limb.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Linb.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Mlym.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Mong.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Orya.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Sinh.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Talu.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Taml.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Telu.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Tibt.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Zinh.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Zyyy.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Sc/Zzzz.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Arab.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Armn.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Beng.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Bopo.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Cakm.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Cprt.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Cyrl.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Deva.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Geor.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Grek.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Gujr.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Guru.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Han.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Hang.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Hira.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Kana.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Latn.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Linb.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Mong.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Orya.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Syrc.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Tagb.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Takr.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Thaa.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Yi.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Zinh.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Scx/Zyyy.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Space/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Term/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/UIdeo/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/Upper/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/WB/EX.pl \
    ./usr/share/perl/5.20.2/unicore/lib/WB/FO.pl \
    ./usr/share/perl/5.20.2/unicore/lib/WB/HL.pl \
    ./usr/share/perl/5.20.2/unicore/lib/WB/KA.pl \
    ./usr/share/perl/5.20.2/unicore/lib/WB/LE.pl \
    ./usr/share/perl/5.20.2/unicore/lib/WB/MB.pl \
    ./usr/share/perl/5.20.2/unicore/lib/WB/ML.pl \
    ./usr/share/perl/5.20.2/unicore/lib/WB/MN.pl \
    ./usr/share/perl/5.20.2/unicore/lib/WB/NU.pl \
    ./usr/share/perl/5.20.2/unicore/lib/WB/XX.pl \
    ./usr/share/perl/5.20.2/unicore/lib/XIDC/Y.pl \
    ./usr/share/perl/5.20.2/unicore/lib/XIDS/Y.pl \
    ./usr/share/perl/5.20.2/utf8.pm \
    ./usr/share/perl/5.20.2/utf8_heavy.pl \
    ./usr/share/perl/5.20.2/vars.pm \
    ./usr/share/perl/5.20.2/warnings.pm \
    ./usr/share/perl/5.20.2/warnings/register.pm\
"
